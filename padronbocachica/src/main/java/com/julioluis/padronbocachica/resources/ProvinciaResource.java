package com.julioluis.padronbocachica.resources;

import com.julioluis.padronbocachica.entities.Provincia;
import com.julioluis.padronbocachica.servicies.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("provincias")
public class ProvinciaResource {

    @Autowired
    private PlaceService placeService;

    public ResponseEntity<List<Provincia>> getProvincias() {

        List<Provincia> provincias=placeService.findAllProvincias();

        return ResponseEntity.ok()
                .body(provincias);
    }

}
