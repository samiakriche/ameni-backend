package org.raoul.PFE.web;

import org.raoul.PFE.entities.Pointeuse;
import org.raoul.PFE.repositories.PointeuseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController

public class PointeuseRestController {
    @Autowired
    private PointeuseRepository rps;

    public PointeuseRestController(PointeuseRepository rps)
    {
        this.rps=rps;
    }
    @GetMapping(path="/pointeuse")
    public List<Pointeuse> list()
    {
        return rps.findAll();
    }
    @GetMapping(path="/pointeuse/{id}")
    public Pointeuse getByID(@PathVariable(name="id") long id)
    {
        return rps.findById(id).get();
    }
    @GetMapping(path="/pointeuse/find/{nom}")
    public List<Pointeuse> getByNom(@PathVariable(name="nom") String nom)
    {

        return  rps.findByNom(nom);
    }
    @PostMapping(path="/pointeuse")
    public Pointeuse Save(@RequestBody Pointeuse data)
    {

        return rps.save(data);
    }
    @PutMapping(path="/pointeuse/{id}")
    public Pointeuse Update(@PathVariable long id,@RequestBody Pointeuse data)
    {
        return rps.save(data);
    }
    @DeleteMapping(path="/pointeuse/{id}")
    public void Delete(@PathVariable long id)
    {

        rps.deleteById(id);


    }


}
