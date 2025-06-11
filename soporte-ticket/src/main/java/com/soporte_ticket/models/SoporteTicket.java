package com.soporte_ticket.models;

import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "soporte_ticket")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoporteTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_soporte")
    private Integer idSoporte;
    private Integer idUsuario;
    private Integer idMotivo;
    private String descripcion;
    private Date fechaCreacion;
    private Date fechaResolucion;


}
