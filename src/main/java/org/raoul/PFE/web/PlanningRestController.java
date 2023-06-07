package org.raoul.PFE.web;


import org.raoul.PFE.entities.Planning;
import org.raoul.PFE.repositories.PlanningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PlanningRestController {
    @Autowired
    private PlanningRepository rps;

    public PlanningRestController(PlanningRepository rps)
    {
        this.rps=rps;
    }
    @GetMapping(path="/planning")
    public List<Planning> list()
    {
        return rps.findAll();
    }
    @GetMapping(path="/planning/{id}")
    public Planning getByID(@PathVariable(name="id") long id)
    {
        return rps.findById(id).get();
    }
    @GetMapping(path="/planning/find/{equipe}")
    public List<Planning> getByEquipe(@PathVariable(name="equipe") long equipe)
    {

        return  rps.findByEquipe(equipe);
    }
    @GetMapping(path="/planning/find/{employe}")
    public List<Planning> getByEmploye(@PathVariable(name="employe") long employe)
    {

        return  rps.findByEmploye(employe);
    }
    @PostMapping(path="/planning")
    public Planning  Save(@RequestBody Planning data)
    {

        return rps.save(data);
    }
    @PutMapping(path="/planning/{id}")
    public Planning Update(@PathVariable long id,@RequestBody Planning data)
    {
    	
        return rps.save(data);
    }
    @DeleteMapping(path="/planning/{id}")
    public void Delete(@PathVariable long id)
    {

        rps.deleteById(id);


    }


}
