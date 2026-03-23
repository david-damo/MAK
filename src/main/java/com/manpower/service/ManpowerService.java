
package com.manpower.service;
import com.manpower.entity.Manpower;
import com.manpower.repository.ManpowerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ManpowerService {
    private final ManpowerRepository repo;
    public ManpowerService(ManpowerRepository repo){this.repo=repo;}
    public Manpower save(Manpower m){return repo.save(m);}
    public List<Manpower> getAll(){return repo.findAll();}
}
