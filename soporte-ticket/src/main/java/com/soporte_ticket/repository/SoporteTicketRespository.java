package com.soporte_ticket.repository;

import com.soporte_ticket.models.SoporteTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoporteTicketRespository extends JpaRepository<SoporteTicket, Integer> {
    
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar tickets por usuario o motivo:
    // List<SoporteTicket> findByIdUsuario(Integer idUsuario);
    // List<SoporteTicket> findByIdMotivo(Integer idMotivo);

}
