
package com.manpower.controller;
import com.manpower.entity.Manpower;
import com.manpower.service.ManpowerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/manpower")
//@CrossOrigin(origins = "http://localhost:3000")
public class ManpowerController {
    private final ManpowerService service;
    public ManpowerController(ManpowerService service){this.service=service;}

    @PostMapping
    public Manpower save(@RequestBody Manpower m){return service.save(m);}

    @GetMapping
    public List<Manpower> getAll(){return service.getAll();}
}
