package org.raoul.PFE.repositories;


import org.raoul.PFE.entities.TypeContrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeContratRepository extends JpaRepository<TypeContrat,Long> {
    @Query(value = "SELECT * FROM TypeContrat WHERE description=?",nativeQuery = true)
    public List<TypeContrat> findByDescription(String description);
}
