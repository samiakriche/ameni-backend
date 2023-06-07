package org.raoul.PFE.web;

import java.util.List;

import org.raoul.PFE.entities.Ville;
import org.raoul.PFE.repositories.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class VilleRestController {
	@Autowired
    private VilleRepository rps;

    public VilleRestController(VilleRepository rps)
    {
        this.rps=rps;
    }
    @GetMapping(path="/ville")
    public List<Ville> list()
    {
        return rps.findAll();
    }
    @GetMapping(path="/ville/{id}")
    public Ville getByID(@PathVariable(name="id") long id)
    {
        return rps.findById(id).get();
    }
   

    @PostMapping(path="/ville")
    public Ville Save(@RequestBody Ville data)
    {

        return rps.save(data);
    }
    @PutMapping(path="/ville/{id}")
    public Ville Update(@PathVariable long id,@RequestBody Ville data)
    {
        return rps.save(data);
    }
    @DeleteMapping(path="/ville/{id}")
    public void Delete(@PathVariable long id)
    {

        rps.deleteById(id);


    }

}






