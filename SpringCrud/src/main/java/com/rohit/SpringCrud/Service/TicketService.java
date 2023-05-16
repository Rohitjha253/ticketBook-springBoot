package com.rohit.SpringCrud.Service;

import com.rohit.SpringCrud.Model.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    String bookTicket(List<Ticket> tickets);

    List<Ticket> getTickets();

    Optional<Ticket> getTicket(Integer ticketId);
}
