package org.raoul.PFE.repositories;

import java.util.List;


import org.raoul.PFE.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VilleRepository extends JpaRepository<Ville,Long> {
	List<Ville> findByNom(String nom);

}
