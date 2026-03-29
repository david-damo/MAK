package com.manpower.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Map;

@Entity
public class Manpower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    // 🔥 Dynamic roles
    @ElementCollection
    @CollectionTable(name = "manpower_roles", joinColumns = @JoinColumn(name = "manpower_id"))
    @MapKeyColumn(name = "role")
    @Column(name = "count")
    private Map<String, Integer> roles;

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Map<String, Integer> getRoles() {
        return roles;
    }

    public void setRoles(Map<String, Integer> roles) {
        this.roles = roles;
    }
}