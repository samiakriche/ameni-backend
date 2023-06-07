package org.raoul.PFE.repositories;



import org.raoul.PFE.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;


public interface EquipeRepository extends JpaRepository<Equipe, Long> {
    @Query(value = "SELECT * FROM Equipe WHERE nom=?",nativeQuery = true)
    public List<Equipe> findByNom(String nom);
    @Query(value = "SELECT * FROM Equipe WHERE succursale=?",nativeQuery = true)
    public List<Equipe> findBySuccursale(long succursale);
    @Query(value = "SELECT * FROM Equipe WHERE superviseurs =?",nativeQuery = true)
    public Equipe findBySuperviseur(long id);

}
