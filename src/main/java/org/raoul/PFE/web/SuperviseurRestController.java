package org.raoul.PFE.web;

import org.raoul.PFE.entities.Superviseur;
import org.raoul.PFE.repositories.SuperviseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class SuperviseurRestController {
    @Autowired
    private SuperviseurRepository rps;

    public SuperviseurRestController(SuperviseurRepository rps)
    {
        this.rps=rps;
    }
    @GetMapping(path="/superviseur")
    public List<Superviseur> list()
    {
        return rps.findAll();
    }
    @GetMapping(path="/superviseur/{prenom}")

    

    @PostMapping(path="/superviseur")
    public Superviseur  Save(@RequestBody Superviseur data)
    {

        return rps.save(data);
    }
    @PutMapping(path="/superviseur/{id}")
    public Superviseur Update(@PathVariable long id,@RequestBody Superviseur data)
    {
        return rps.save(data);
    }
    @DeleteMapping(path="/superviseur/{id}")
    public void Delete(@PathVariable long id)
    {

        rps.deleteById(id);


    }
}
