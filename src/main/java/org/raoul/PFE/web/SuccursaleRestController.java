package org.raoul.PFE.web;

import org.raoul.PFE.entities.Succursale;
import org.raoul.PFE.repositories.SuccursaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class SuccursaleRestController {
    @Autowired
    private SuccursaleRepository rps;

    public SuccursaleRestController(SuccursaleRepository rps)
    {
        this.rps=rps;
    }
    @GetMapping(path="/succursale")
    public List<Succursale> list()
    {
        return rps.findAll();
    }
    @GetMapping(path="/succursale/{id}")
    public Succursale getByID(@PathVariable(name="id") long id)
    {
        return rps.findById(id).get();
    }
    @GetMapping(path="/succursale/find/{nom}")
    public List<Succursale> getByNom(@PathVariable(name="nom") String nom)
    {

        return  rps.findByNom(nom);
    }

    @PostMapping(path="/succursale")
    public Succursale  Save(@RequestBody Succursale data)
    {

        return rps.save(data);
    }
    @PutMapping(path="/succursale/{id}")
    public Succursale Update(@PathVariable long id,@RequestBody Succursale data)
    {
        return rps.save(data);
    }
    @DeleteMapping(path="/succursale/{id}")
    public void Delete(@PathVariable long id)
    {

        rps.deleteById(id);


    }

}
