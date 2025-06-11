package com.perfunlandia.gestionlocalizacionapi.controller;

import com.perfunlandia.gestionlocalizacionapi.dto.DireccionDTO;
import com.perfunlandia.gestionlocalizacionapi.services.DireccionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/direcciones")
@RequiredArgsConstructor
public class DireccionController
{

    private final DireccionService direccionService;

    // Endpoint para listar todas las direcciones (opcional)
    @GetMapping
    public ResponseEntity<List<DireccionDTO>> listarTodas() {
        return ResponseEntity.ok(direccionService.listarDireccionesDto());
    }

    // Endpoint para agregar una nueva dirección
    @PostMapping
    public ResponseEntity<DireccionDTO> agregarDireccion(@RequestBody DireccionDTO dto) {
        return ResponseEntity.ok(direccionService.agregarDireccion(
                dto.getNombreCalle(),
                dto.getNumeracion(),
                dto.getNombreComuna(),
                dto.getNombreCiudad(),
                dto.getNombreRegion()
        ));
    }

   
    @GetMapping("/sucursales/{id}/existe")
    public ResponseEntity<Boolean> existeSucursal(@PathVariable Integer id) {
        boolean existe = direccionService.existeDireccion(id);
        return ResponseEntity.ok(existe);
    }
}