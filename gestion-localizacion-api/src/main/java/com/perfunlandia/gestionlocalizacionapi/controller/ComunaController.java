package com.perfunlandia.gestionlocalizacionapi.controller;

import com.perfunlandia.gestionlocalizacionapi.models.entities.Comuna;
import com.perfunlandia.gestionlocalizacionapi.services.ComunaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/comunas")
@RequiredArgsConstructor
public class ComunaController
{

    private final ComunaService comunaService;

    @GetMapping("/por-ciudad")
    public ResponseEntity<List<Comuna>> listarPorCiudad(@RequestParam String nombreCiudad) {
        return ResponseEntity.ok(comunaService.listarComunasPorCiudad(nombreCiudad));
    }

    // TEST: para verificar que el controller responde
    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Comuna Controller activo");
    }

}

