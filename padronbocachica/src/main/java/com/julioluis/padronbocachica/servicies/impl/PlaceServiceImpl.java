package com.julioluis.padronbocachica.servicies.impl;

import com.julioluis.padronbocachica.entities.Municipio;
import com.julioluis.padronbocachica.entities.Provincia;
import com.julioluis.padronbocachica.entities.Sector;
import com.julioluis.padronbocachica.repositories.MunicipioRepository;
import com.julioluis.padronbocachica.repositories.ProvinciaRepository;
import com.julioluis.padronbocachica.repositories.SectorRepository;
import com.julioluis.padronbocachica.servicies.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private ProvinciaRepository provinciaRepository;
    @Autowired
    private MunicipioRepository municipioRepository;
    @Autowired
    private SectorRepository sectorRepository;

    @Override
    public List<Provincia> findAllProvincias() {
        return provinciaRepository.findAll();
    }

    @Override
    public List<Municipio> findAllMunicipios() {
        return municipioRepository.findAll();
    }

    @Override
    public List<Sector> findAllSectores() {
        return sectorRepository.findAll();
    }
}
