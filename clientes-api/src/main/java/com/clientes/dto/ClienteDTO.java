package com.clientes.dto;

import lombok.Data;

@Data
public class ClienteDTO {
    private Integer idCliente;
    private Integer idUsuario;
    private Integer idDireccion;
    private String telefono;
}