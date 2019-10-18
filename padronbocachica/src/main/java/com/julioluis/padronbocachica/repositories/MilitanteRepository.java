package com.julioluis.padronbocachica.repositories;

import com.julioluis.padronbocachica.entities.Militante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilitanteRepository extends JpaRepository<Militante,Long> {
}
