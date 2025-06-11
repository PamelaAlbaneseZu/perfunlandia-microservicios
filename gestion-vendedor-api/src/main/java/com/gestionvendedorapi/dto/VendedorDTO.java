package com.gestionvendedorapi.dto;

import lombok.Data;

// DTO para mostrar la informacion del vendedor
@Data
public class VendedorDTO
{

    private Integer idVendedor;
    private Integer idUsuario;     // Api GestionUsuario
    private String nombreUsuario;  // Api GestionUsuario
    private Integer idSucursal;   // Api GestionLocalizacion
    
}
