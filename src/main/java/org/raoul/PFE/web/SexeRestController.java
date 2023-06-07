package org.raoul.PFE.web;

import org.raoul.PFE.entities.Sexe;
import org.raoul.PFE.repositories.SexeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class SexeRestController {
    @Autowired
    private SexeRepository rps;

    public SexeRestController(SexeRepository rps)
    {
        this.rps=rps;
    }
    @GetMapping(path="/sexe")
    public List<Sexe> list()
    {
        return rps.findAll();
    }
    @GetMapping(path="/sexe/{id}")
    public Sexe getByID(@PathVariable(name="id") long id)
    {
        return rps.findById(id).get();
    }
    

    @PostMapping(path="/sexe")
    public Sexe Save(@RequestBody Sexe data)
    {

        return rps.save(data);
    }
    @PutMapping(path="/sexe/{id}")
    public Sexe Update(@PathVariable long id,@RequestBody Sexe data)
    {
        return rps.save(data);
    }
    @DeleteMapping(path="/sexe/{id}")
    public void Delete(@PathVariable long id)
    {

        rps.deleteById(id);


    }

}
