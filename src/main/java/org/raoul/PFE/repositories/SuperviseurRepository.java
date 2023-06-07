package org.raoul.PFE.repositories;


import org.raoul.PFE.entities.Superviseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SuperviseurRepository extends JpaRepository<Superviseur, Long> {
    @Query(value = "SELECT * FROM Superviseur WHERE prenom=?",nativeQuery = true)
    public List<Superviseur> findByPrenom(String prenom);


}
