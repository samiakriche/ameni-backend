package org.raoul.PFE.repositories;


import org.raoul.PFE.entities.Succursale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SuccursaleRepository extends JpaRepository<Succursale, Long> {
    @Query(value = "SELECT * FROM Succursale WHERE nom=?",nativeQuery = true)
    public List<Succursale> findByNom(String nom);
}
