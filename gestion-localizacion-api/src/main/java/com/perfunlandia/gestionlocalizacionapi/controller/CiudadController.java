package com.perfunlandia.gestionlocalizacionapi.controller;

import com.perfunlandia.gestionlocalizacionapi.models.entities.Ciudad;
import com.perfunlandia.gestionlocalizacionapi.services.CiudadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ciudades")  //Ruta para Listar todas las ciudades
@RequiredArgsConstructor
public class CiudadController {

    private final CiudadService ciudadService;

    @GetMapping("/por-region")
    public ResponseEntity<List<Ciudad>> listarCiudadesPorRegion(@RequestParam String nombreRegion) {
        return ResponseEntity.ok(ciudadService.listarCiudadesPorRegion(nombreRegion));
    }
}

