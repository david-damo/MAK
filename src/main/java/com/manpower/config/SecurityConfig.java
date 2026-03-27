package com.manpower.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                // Public APIs
                .requestMatchers("/api/public/**").permitAll()

                // Admin APIs
                .requestMatchers("/api/admin/**").authenticated()

                .anyRequest().permitAll()
            )
            .httpBasic(); // simple login popup

        return http.build();
    }
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new InMemoryUserDetailsManager(
			User.withUsername("admin")
				.password("{noop}admin123")
				.roles("ADMIN")
				.build()
		);
	}
}

