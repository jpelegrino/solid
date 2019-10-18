package com.julioluis.padronbocachica.servicies;

import com.julioluis.padronbocachica.entities.Municipio;
import com.julioluis.padronbocachica.entities.Provincia;
import com.julioluis.padronbocachica.entities.Sector;

import java.util.List;

public interface PlaceService {

    List<Provincia> findAllProvincias();
    List<Municipio> findAllMunicipios();
    List<Sector> findAllSectores();
}
