package org.raoul.PFE.repositories;


import org.raoul.PFE.entities.Planning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlanningRepository extends JpaRepository <Planning,Long> {
    @Query(value = "SELECT * FROM Planning WHERE equipe=?",nativeQuery = true)
    public List<Planning> findByEquipe(long equipe);
    @Query(value = "SELECT * FROM Planning WHERE employe=?",nativeQuery = true)
    public List<Planning> findByEmploye(long employe);
}
