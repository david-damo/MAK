package com.manpower.controller;

import com.manpower.entity.Manpower;
import com.manpower.repository.ManpowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ManpowerController {

    @Autowired
    private ManpowerRepository repository;

    // ✅ PUBLIC API
    @GetMapping("/manpower")
    public List<Manpower> getData() {
        return repository.findAll();
    }

    // ✅ ADMIN API
    @PostMapping("/admin/manpower")
    public Manpower addData(@RequestBody Manpower m) {

        // 🔥 Auto-set date if missing
        if (m.getDate() == null) {
            m.setDate(LocalDate.now());
        }

        return repository.save(m);
    }

    // ✅ Ping for cron
    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }
}