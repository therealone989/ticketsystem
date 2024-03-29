package com.projektwochejf.ticketsystem.controller;

import com.projektwochejf.ticketsystem.model.Ticket;
import com.projektwochejf.ticketsystem.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping("/ticket")
    Ticket newTicket(@RequestBody Ticket newTicket){
        return ticketRepository.save(newTicket);
    }

    @GetMapping("/tickets")
    List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @PutMapping("/ticket/{id}")
    Ticket updateTicketStatus(@RequestBody Ticket ticketDetails, @PathVariable Long id) {
        Ticket ticket = ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found with id " + id));
        ticket.setStatus(ticketDetails.getStatus());
        return ticketRepository.save(ticket);
    }

}
