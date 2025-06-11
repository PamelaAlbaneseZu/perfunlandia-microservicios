package com.gestionvendedorapi.controllers;

// Clase que define los endpoints HTTP que presenta la informacion en (postman)
// utilizando los metodos definidos en services. Tambien se muestran las rutas para las consultas

import com.gestionvendedorapi.dto.*;
import com.gestionvendedorapi.models.VendedorDetalle;
import com.gestionvendedorapi.services.VendedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vendedores")
@RequiredArgsConstructor
public class VendedorController {

    private final VendedorService vendedorService;

    // POST /vendedores
    @PostMapping
    public ResponseEntity<VendedorDetalle> crear(@RequestBody CrearVendedorRequest request) {
        VendedorDetalle nuevo = vendedorService.crearVendedor(request);
        return ResponseEntity.ok(nuevo);
    }

    // GET /vendedores/{id}
    @GetMapping("/{id}")
    public ResponseEntity<VendedorDTO> obtenerPorId(@PathVariable Integer id) {
        VendedorDTO dto = vendedorService.obtenerVendedor(id);
        return ResponseEntity.ok(dto);
    }

    // PUT /vendedores
    @PutMapping
    public ResponseEntity<VendedorDTO> actualizarSucursal(@RequestBody ActualizarSucursalRequest request) {
        VendedorDTO actualizado = vendedorService.actualizarSucursal(
                request.getIdVendedor(), request.getNuevaSucursal());
        return ResponseEntity.ok(actualizado);
    }

    // GET /vendedores/sucursal/{idSucursal}
    @GetMapping("/sucursal/{idSucursal}")
    public ResponseEntity<List<VendedorDTO>> listarPorSucursal(@PathVariable Integer idSucursal) {
        List<VendedorDTO> lista = vendedorService.listarPorSucursal(idSucursal);
        return ResponseEntity.ok(lista);
    }
}