package org.raoul.PFE.web;
import org.raoul.PFE.entities.Employe;
import org.raoul.PFE.repositories.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employe")
public class EmployeRestController {

    private final EmployeRepository rps;

    @Autowired
    public EmployeRestController(EmployeRepository rps) {
        this.rps = rps;
    }

    @RequestMapping("/")
    public String home() {
        return "Bienvenue chez Net'Advisor";
    }

    @GetMapping
    public List<Employe> list() {
        System.out.println("hello");
        return rps.findAll();
    }

    @GetMapping("/{id}")
    public Employe getByID(@PathVariable("id") long id) {
        return rps.findById(id).get();
    }

    @GetMapping("/find/nom/{nom}")
    public List<Employe> getByNom(@PathVariable("nom") String nom) {
        return rps.findByNom(nom);
    }

    @GetMapping("/find/prenom/{prenom}")
    public List<Employe> getByPrenom(@PathVariable("prenom") String prenom) {
        return rps.findByPrenom(prenom);
    }

    @GetMapping("/find/equipe/{equipe}")
    public List<Employe> getByEquipe(@PathVariable("equipe") long equipe) {
        return rps.findByEquipe(equipe);
    }

    @GetMapping("/find/succursale/{succursale}")
    public List<Employe> getBySuccursale(@PathVariable("succursale") long succursale) {
        return rps.findBySuccursale(succursale);
    }

    @PostMapping
    public Employe save(@RequestBody Employe data) {
        return rps.save(data);
    }

    @PutMapping("/{id}")
    public Employe update(@PathVariable long id, @RequestBody Employe data) {
        return rps.save(data);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        rps.deleteById(id);
    }
}