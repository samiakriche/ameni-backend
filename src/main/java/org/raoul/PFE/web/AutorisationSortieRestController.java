package org.raoul.PFE.web;

import org.raoul.PFE.entities.AutorisationSortie;
import org.raoul.PFE.repositories.AutorisationSortieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController

public class AutorisationSortieRestController {
    @Autowired
    private AutorisationSortieRepository rps;

    public AutorisationSortieRestController(AutorisationSortieRepository rps)
    {
        this.rps=rps;
    }



    @GetMapping(path="/autorisationSortie")
    public List<AutorisationSortie> list()
    {
        return rps.findAll();
    }
    @GetMapping(path="/autorisationSortie/{id}")
    public AutorisationSortie getByID(@PathVariable(name="id") long id)
    {
        return rps.findById(id).get();
    }


    @PostMapping(path="/autorisationSortie")
    public AutorisationSortie  Save(@RequestBody AutorisationSortie data)
    {

        return rps.save(data);
    }
    @PutMapping(path="/autorisationSortie/{id}")
    public AutorisationSortie Update(@PathVariable long id,@RequestBody AutorisationSortie data)
    {
        return rps.save(data);
    }
    @DeleteMapping(path="/autorisationSortie/{id}")
    public void Delete(@PathVariable long id)
    {

        rps.deleteById(id);


    }

}
