package com.manpower.controller;

import com.manpower.entity.Manpower;
import com.manpower.repository.ManpowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ManpowerController {

    @Autowired
    private ManpowerRepository repository;

    // ✅ PUBLIC API (no login)
    @GetMapping("/manpower")
    public List<Manpower> getData() {
        return repository.findAll();
    }

    // ✅ ADMIN API (login required)
    @PostMapping("/admin/manpower")
    public Manpower addData(@RequestBody Manpower m) {
        return repository.save(m);
    }
}