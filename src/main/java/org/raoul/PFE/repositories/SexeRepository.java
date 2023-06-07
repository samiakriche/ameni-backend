package org.raoul.PFE.repositories;


import org.raoul.PFE.entities.Sexe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface SexeRepository extends JpaRepository<Sexe, Long> {
  
}
