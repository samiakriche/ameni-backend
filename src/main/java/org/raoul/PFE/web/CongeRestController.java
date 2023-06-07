package org.raoul.PFE.web;

import org.raoul.PFE.entities.Conge;
import org.raoul.PFE.repositories.CongeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController

public class CongeRestController {
    @Autowired
    private CongeRepository rps;

    public CongeRestController(CongeRepository rps)
    {
        this.rps=rps;
    }



    @GetMapping(path="/conge")
    public List<Conge> list()
    {
        return rps.findAll();
    }
    @GetMapping(path="/conge/{id}")
    public Conge getByID(@PathVariable(name="id") long id)
    {
        return rps.findById(id).get();
    }
    @GetMapping(path="/conge/find/{motif}")
    public List<Conge> getByMotif(@PathVariable(name="motif") String motif)
    {

        return  rps.findByMotif(motif);
    }
    @GetMapping(path="/conge/employe/{id}")
    public Conge getById(@PathVariable(name="id") long id)
    {

        return  rps.findByEmploye(id);
    }


    @PostMapping(path="/conge")
    public Conge  Save(@RequestBody Conge data)
    {

        return rps.save(data);
    }
    @PutMapping(path="/conge/{id}")
    public Conge Update(@PathVariable long id,@RequestBody Conge data)
    {
        return rps.save(data);
    }
    @DeleteMapping(path="/conge/{id}")
    public void Delete(@PathVariable long id)
    {

        rps.deleteById(id);


    }

}
