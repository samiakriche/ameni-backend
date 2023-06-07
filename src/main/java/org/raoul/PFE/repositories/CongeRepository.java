package org.raoul.PFE.repositories;

import org.raoul.PFE.entities.Conge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CongeRepository extends JpaRepository<Conge,Long> {
    @Query(value = "SELECT * FROM Conge WHERE employes =?",nativeQuery = true)
    public Conge findByEmploye(long id);
    @Query(value = "SELECT * FROM Conge WHERE motif=?",nativeQuery = true)
    public List<Conge> findByMotif(String motif);

}
