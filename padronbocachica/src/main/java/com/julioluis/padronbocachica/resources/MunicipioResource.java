package com.julioluis.padronbocachica.resources;

import com.julioluis.padronbocachica.entities.Municipio;
import com.julioluis.padronbocachica.servicies.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("municipios")
public class MunicipioResource {

    @Autowired
    private PlaceService placeService;

    @GetMapping
    public ResponseEntity<List<Municipio>> getMunicipios() {

        List<Municipio> municipios=placeService.findAllMunicipios();

        return ResponseEntity.ok()
                .body(municipios);
    }

}
