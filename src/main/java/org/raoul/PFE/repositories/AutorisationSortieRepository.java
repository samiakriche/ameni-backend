package org.raoul.PFE.repositories;

import org.raoul.PFE.entities.AutorisationSortie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface AutorisationSortieRepository extends JpaRepository<AutorisationSortie,Long> {
    @Query(value = "SELECT * FROM AutorisationSortie WHERE employe =?",nativeQuery = true)
    public AutorisationSortie findByEmploye(long employe);
    @Query(value = "SELECT * FROM AutorisationSortie WHERE equipe =?",nativeQuery = true)
    public AutorisationSortie findByEquipe(long equipe);

}

