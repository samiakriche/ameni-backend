package org.raoul.PFE.repositories;

import java.util.List;

import org.raoul.PFE.entities.Pointage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointageRepository extends JpaRepository<Pointage,Long> {

	List<Pointage> findAllByOrderByDateDesc();

}
