package org.raoul.PFE.repositories;

import java.util.List;

import org.raoul.PFE.entities.Motif;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotifRepository extends JpaRepository<Motif, Long> {
    List<Motif> findByDescription(String description);
}


