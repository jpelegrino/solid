package com.julioluis.padronbocachica.repositories;

import com.julioluis.padronbocachica.entities.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio,Long> {
}
