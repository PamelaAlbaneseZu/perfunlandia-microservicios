package com.perfunlandia.gestionenvioapi.controllers;

import com.perfunlandia.gestionenvioapi.models.entities.Envio;
import com.perfunlandia.gestionenvioapi.services.EnvioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/envios")
@RequiredArgsConstructor
public class EnvioController {

    private final EnvioService envioService;

    @PostMapping
    public ResponseEntity<Envio> crearEnvio(@RequestBody Envio envio) {
        return ResponseEntity.ok(envioService.guardarEnvio(envio));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Envio> obtenerPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(envioService.obtenerPorId(id));
    }

    @GetMapping("/venta/{idVenta}")
    public ResponseEntity<Envio> obtenerPorIdVenta(@PathVariable Integer idVenta) {
        return ResponseEntity.ok(envioService.obtenerPorIdVenta(idVenta));
    }

    @PutMapping
    public ResponseEntity<Envio> actualizarEnvio(@RequestBody Envio envio) {
        return ResponseEntity.ok(envioService.actualizarEnvio(envio));
    }

    @GetMapping
    public ResponseEntity<List<Envio>> listarTodos() {
        return ResponseEntity.ok(envioService.listarTodos());
    }
}