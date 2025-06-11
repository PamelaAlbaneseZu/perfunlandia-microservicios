package com.soporte_ticket.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soporte_ticket.models.SoporteTicket;
import com.soporte_ticket.service.SoporteTicketService;

import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tickets")
public class SoporteTicketController {

    private final SoporteTicketService soporteTicketService;

    public SoporteTicketController(SoporteTicketService soporteTicketService) {
        this.soporteTicketService = soporteTicketService;
    }

    @GetMapping
    public ResponseEntity<List<SoporteTicket>> getAll() {
        List<SoporteTicket> tickets = soporteTicketService.findAll();
        return ResponseEntity.ok(tickets);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id){
        Optional<SoporteTicket> ticket = soporteTicketService.findById(id);
        if (ticket.isPresent()) {
            return ResponseEntity.ok(ticket.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<SoporteTicket> crearSoporteTicket(@RequestBody SoporteTicket ticket) {
        SoporteTicket nuevoTicket = soporteTicketService.save(ticket);
        return ResponseEntity.status(201).body(nuevoTicket);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SoporteTicket> ActualizarSoporteTicket(@PathVariable Integer id, @RequestBody SoporteTicket ticket) {
        SoporteTicket ticketActualizado = soporteTicketService.ActualizarSoporteTicket(id, ticket);
        return ResponseEntity.ok(ticketActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id) {
        if (soporteTicketService.findById(id).isPresent()) {
            soporteTicketService.deleteById(id);
            return ResponseEntity.ok("Ticket eliminado con éxito");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
