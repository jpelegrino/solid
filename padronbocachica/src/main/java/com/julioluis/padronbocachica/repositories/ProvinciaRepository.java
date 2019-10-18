package com.julioluis.padronbocachica.repositories;

import com.julioluis.padronbocachica.entities.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia,Long> {
}
