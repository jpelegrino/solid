package com.julioluis.padronbocachica.servicies.impl;

import com.julioluis.padronbocachica.entities.Militante;
import com.julioluis.padronbocachica.repositories.MilitanteRepository;
import com.julioluis.padronbocachica.servicies.MilitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MilitanteServiceImpl implements MilitanteService {

    @Autowired
    private MilitanteRepository militanteRepository;

    @Override
    public Militante save(Militante militante) {
        return militanteRepository.save(militante);
    }
}
