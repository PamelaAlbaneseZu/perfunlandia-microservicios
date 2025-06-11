package com.perfunlandia.gestionlocalizacionapi.dto;


import lombok.Data;

@Data
public class DireccionDTO 
{
    private String nombreCalle;
    private String numeracion;
    private String nombreComuna;
    private String nombreCiudad;
    private String nombreRegion;

}