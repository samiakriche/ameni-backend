package org.raoul.PFE.repositories;

import org.raoul.PFE.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
    @Query(value = "SELECT * FROM Employe WHERE succursale = ?1", nativeQuery = true)
    public List<Employe> findBySuccursale(long succursale);

    @Query(value = "SELECT * FROM Employe WHERE equipe = ?1", nativeQuery = true)
    public List<Employe> findByEquipe(long equipe);

    @Query(value = "SELECT * FROM Employe WHERE nom = ?1", nativeQuery = true)
    public List<Employe> findByNom(String nom);

    @Query(value = "SELECT * FROM Employe WHERE prenom = ?1", nativeQuery = true)
    public List<Employe> findByPrenom(String prenom);
}