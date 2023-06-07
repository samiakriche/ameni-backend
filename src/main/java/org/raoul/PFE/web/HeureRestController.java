package org.raoul.PFE.web;


import org.raoul.PFE.entities.Heure;
import org.raoul.PFE.repositories.HeureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@CrossOrigin(origins = "*")
@RestController
public class HeureRestController {
    @Autowired
    private HeureRepository rps;

    public HeureRestController(HeureRepository rps)
    {
        this.rps=rps;
    }



    @GetMapping(path="/heure")
    public List<Heure> list()
    {
        return rps.findAll();
    }
    @GetMapping(path="/heure/{id}")
    public Heure getByID(@PathVariable(name="id") long id)
    {
        return rps.findById(id).get();
    }



    @PostMapping(path="/heure")
    public Heure Save(@RequestBody  Heure  data)
    {

        return rps.save(data);
    }
    @PutMapping(path="/heure/{id}")
    public Heure Update(@PathVariable long id,@RequestBody Heure data)
    {
        return rps.save(data);
    }
    @DeleteMapping(path="/heure/{id}")
    public void Delete(@PathVariable long id)
    {

        rps.deleteById(id);


    }

}


