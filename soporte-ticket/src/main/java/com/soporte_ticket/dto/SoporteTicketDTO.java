package com.soporte_ticket.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoporteTicketDTO {
    private Integer idSoporte;
    private Integer idUsuario;
    private Integer idMotivo;
    private String descripcion;
    private String fechaCreacion;
    private String fechaResolucion;

    
}