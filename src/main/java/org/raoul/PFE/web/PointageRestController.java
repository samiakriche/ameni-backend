package org.raoul.PFE.web;

import org.raoul.PFE.entities.Pointage;
import org.raoul.PFE.repositories.PointageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.util.List;


@CrossOrigin(origins = "*")
@RestController
public class PointageRestController {
    @Autowired
    private PointageRepository rps;
    @Autowired
    private RestTemplate restTemplate;
   

    public PointageRestController(PointageRepository rps) {
        this.rps = rps;
    }

    @GetMapping(path = "/pointage")
    public List<Pointage> list() {
    	return rps.findAllByOrderByDateDesc();
    }

    @GetMapping(path = "/pointage/{id}")
    public ResponseEntity<Pointage> getByID(@PathVariable(name = "id") long id) {
        Pointage pointage = rps.findById(id).orElse(null);
        if (pointage == null) {
            return ResponseEntity.notFound().build();
        }
        restTemplate = new RestTemplate();

        // Appel à l'URL http://localhost:8080/pointage/{id}/retard
        ResponseEntity<String> retardResponse = restTemplate.getForEntity("http://localhost:8080/pointage/{id}/retard", String.class, id);

        if (retardResponse.getStatusCode().is2xxSuccessful()) {
            String retardValue = retardResponse.getBody();

            
            pointage.setRetard(retardValue);

            // Retour de l'objet Pointage modifié
            return ResponseEntity.ok(pointage);
        } else {
            return ResponseEntity.status(retardResponse.getStatusCode()).build();
        }
    }

    @GetMapping(path = "/pointage/{id}/retard")
    public ResponseEntity<String> calculerRetard(@PathVariable(name = "id") long id) {
        Pointage pointage = rps.findById(id).orElse(null);
        if (pointage == null) {
            return ResponseEntity.notFound().build();
        }

        Duration retard = pointage.calculerRetard();
        long minutes = retard.toMinutes();

        long heures = minutes / 60;
        long minutesRestantes = minutes % 60;

        String retardString = "Retard: " + heures + "h " + minutesRestantes + "min";
        return ResponseEntity.ok(retardString);
    }

    @PostMapping(path = "/pointage")
    public Pointage save(@RequestBody Pointage data) {
        return rps.save(data);
    }

    @PutMapping(path = "/pointage/{id}")
    public ResponseEntity<Pointage> update(@PathVariable long id, @RequestBody Pointage data) {
        Pointage existingPointage = rps.findById(id).orElse(null);
        if (existingPointage == null) {
            return ResponseEntity.notFound().build();
        }

        existingPointage.setRetard(data.getRetard()); // Update the retard value

        Pointage updatedPointage = rps.save(existingPointage);
        return ResponseEntity.ok(updatedPointage);
    }

    @DeleteMapping(path = "/pointage/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        Pointage pointage = rps.findById(id).orElse(null);
        if (pointage == null) {
            return ResponseEntity.notFound().build();
        }

        rps.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}