package com.rohit.SpringCrud.Controller;

import com.rohit.SpringCrud.Model.Ticket;
import com.rohit.SpringCrud.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketservice;

    @PostMapping("/bookTicket")
    public String booktickets(@RequestBody() List<Ticket> tickets){
        return ticketservice.bookTicket(tickets);
    }

    @GetMapping("/getTickets")
    public List<Ticket> booktickets(){
        return ticketservice.getTickets();
    }

    @GetMapping("/getTicket")
    public Optional<Ticket> booktickets(@RequestParam("ticketId") Integer ticketId){
        return ticketservice.getTicket(ticketId);
    }

    public String updateprice(@RequestBody() Integer price)
        return
}
