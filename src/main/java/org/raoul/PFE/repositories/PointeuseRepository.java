package org.raoul.PFE.repositories;
import org.raoul.PFE.entities.Pointeuse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PointeuseRepository extends JpaRepository<Pointeuse,Long> {
    @Query(value = "SELECT * FROM Pointeuse WHERE succursale=?",nativeQuery = true)
    public List<Pointeuse> findBySuccursale(long succursale);
    @Query(value = "SELECT * FROM Pointeuse WHERE nom=?",nativeQuery = true)
    public List<Pointeuse> findByNom(String nom);
}
