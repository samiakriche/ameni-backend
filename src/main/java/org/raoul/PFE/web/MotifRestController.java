package org.raoul.PFE.web;

import java.util.List;

import org.raoul.PFE.entities.Motif;
import org.raoul.PFE.repositories.MotifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class MotifRestController {
	@Autowired
    private MotifRepository rps;

    public MotifRestController(MotifRepository rps)
    {
        this.rps=rps;
    }
    @GetMapping(path="/motif")
    public List<Motif> list()
    {
        return rps.findAll();
    }
    @GetMapping(path="/motif/{id}")
    public Motif getByID(@PathVariable(name="id") long id)
    {
        return rps.findById(id).get();
    }
    @GetMapping(path="/motif/find/{description}")
    public List<Motif> getByDescription(@PathVariable(name="description") String description)
    {

        return  rps.findByDescription(description);
    }

    @PostMapping(path="/motif")
    public Motif Save(@RequestBody Motif data)
    {

        return rps.save(data);
    }
    @PutMapping(path="/motif/{id}")
    public Motif Update(@PathVariable long id,@RequestBody Motif data)
    {
        return rps.save(data);
    }
    @DeleteMapping(path="/motif/{id}")
    public void Delete(@PathVariable long id)
    {

        rps.deleteById(id);


    }

}


