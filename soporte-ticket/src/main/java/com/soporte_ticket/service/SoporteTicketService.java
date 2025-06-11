package com.soporte_ticket.service;

import com.soporte_ticket.models.SoporteTicket;
import com.soporte_ticket.repository.SoporteTicketRespository;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class SoporteTicketService {

    private final SoporteTicketRespository soporteTicketRespository;

    public SoporteTicketService(SoporteTicketRespository soporteTicketRespository) {
        this.soporteTicketRespository = soporteTicketRespository;
    }

    public List<SoporteTicket> findAll() {
        return soporteTicketRespository.findAll();
    }

    public Optional<SoporteTicket> findById(Integer id) {
        return soporteTicketRespository.findById(id);
    }

    public SoporteTicket save(SoporteTicket ticket) {
        return soporteTicketRespository.save(ticket);
    }

    public void deleteById(Integer id) {
        soporteTicketRespository.deleteById(id);
    }

    public SoporteTicket ActualizarSoporteTicket(Integer id, SoporteTicket ticket) {
        SoporteTicket ticketExistente = soporteTicketRespository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket no encontrado con id: " + id));
        ticketExistente.setIdUsuario(ticket.getIdUsuario());
        ticketExistente.setIdMotivo(ticket.getIdMotivo());
        ticketExistente.setDescripcion(ticket.getDescripcion());
        ticketExistente.setFechaCreacion(ticket.getFechaCreacion());
        ticketExistente.setFechaResolucion(ticket.getFechaResolucion());
        return soporteTicketRespository.save(ticketExistente);
    }

    public SoporteTicket  crearSoporteTicket(SoporteTicket ticket) {
        return soporteTicketRespository.save(ticket);
    }

}
