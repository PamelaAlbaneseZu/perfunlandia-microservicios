package com.perfunlandia.gestionlocalizacionapi.controller;

import com.perfunlandia.gestionlocalizacionapi.models.entities.Region;
import com.perfunlandia.gestionlocalizacionapi.services.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/regiones")
@RequiredArgsConstructor
public class RegionController {

    private final RegionService regionService;

    @GetMapping
    public ResponseEntity<List<Region>> listarTodas() {
        return ResponseEntity.ok(regionService.listarTodasLasRegiones());
    }
}

