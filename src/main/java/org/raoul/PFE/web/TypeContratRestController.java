package org.raoul.PFE.web;

import org.raoul.PFE.entities.TypeContrat;
import org.raoul.PFE.repositories.TypeContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController

public class TypeContratRestController {
    @Autowired
    private TypeContratRepository rps;

    public TypeContratRestController(TypeContratRepository rps)
    {
        this.rps=rps;
    }
    @GetMapping(path="/typeContrat")
    public List<TypeContrat> list()
    {
    	
        return rps.findAll();
    }
    @GetMapping(path="/typeContrat/{id}")
    public TypeContrat getByID(@PathVariable(name="id") long id)
    {
        return rps.findById(id).get();
    }
    @GetMapping(path="/typeContrat/find/{description}")
    public List<TypeContrat> getByDescription(@PathVariable(name="description") String description)
    {

        return  rps.findByDescription(description);
    }

    @PostMapping(path="/typeContrat")
    public TypeContrat Save(@RequestBody TypeContrat data)
    {

        return rps.save(data);
    }
    @PutMapping(path="/typeContrat/{id}")
    public TypeContrat Update(@PathVariable long id,@RequestBody TypeContrat data)
    {
        return rps.save(data);
    }
    @DeleteMapping(path="/typeContrat/{id}")
    public void Delete(@PathVariable long id)
    {

        rps.deleteById(id);


    }

}
