package org.raoul.PFE.web;


import org.raoul.PFE.entities.Equipe;
import org.raoul.PFE.repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class EquipeRestController {
    @Autowired
    private EquipeRepository rps;

    public EquipeRestController(EquipeRepository rps)
    {
        this.rps=rps;
    }
    @GetMapping(path="/equipe")
    public List<Equipe> list()
    {
        return rps.findAll();
    }
    @GetMapping(path="/equipe/{id}")
    public Equipe getByID(@PathVariable(name="id") long id)
    {
        return rps.findById(id).get();
    }
    @GetMapping(path="/equipe/superviseur/{id}")
    public Equipe getById(@PathVariable(name="id") long id)
    {

        return  rps.findBySuperviseur(id);
    }
    @GetMapping(path="/equipe/find/{nom}")
    public List<Equipe> getByNom(@PathVariable(name="nom") String nom)
    {

        return  rps.findByNom(nom);
    }

    @GetMapping(path="/equipe/find/{succursale}")
    public List<Equipe> getBySuccursale(@PathVariable(name="succursale") long succursale)
    {

        return  rps.findBySuccursale(succursale);
    }
    @PostMapping(path="/equipe")
    public Equipe  Save(@RequestBody Equipe data)
    {

        return rps.save(data);
    }
    @PutMapping(path="/equipe/{id}")
    public Equipe Update(@PathVariable long id,@RequestBody Equipe data)
    {
        return rps.save(data);
    }
    @DeleteMapping(path="/equipe/{id}")
    public void Delete(@PathVariable long id)
    {

        rps.deleteById(id);


    }


}
