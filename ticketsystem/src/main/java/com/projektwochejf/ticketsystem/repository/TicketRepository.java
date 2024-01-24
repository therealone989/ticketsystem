package com.projektwochejf.ticketsystem.repository;

import com.projektwochejf.ticketsystem.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
