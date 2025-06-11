package com.perfunlandia.gestionenvioapi.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class EnvioDTO
{
    private Integer idEnvio;
    private Integer idVenta;
    private String estadoEnvio;
    private LocalDate fechaEnvio;
    private LocalDate fechaEntrega;
    private Integer idDireccion;
}