package com.julioluis.padronbocachica.resources;

import com.julioluis.padronbocachica.entities.Sector;
import com.julioluis.padronbocachica.servicies.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sectores")
public class SectorResource {

    @Autowired
    private PlaceService placeService;

    @GetMapping
    public ResponseEntity<List<Sector>> getSectores() {

        List<Sector> sectors=placeService.findAllSectores();

        return ResponseEntity.ok()
                .body(sectors);
    }
}
