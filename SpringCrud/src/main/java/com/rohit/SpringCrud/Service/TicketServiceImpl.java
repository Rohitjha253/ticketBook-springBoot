package com.rohit.SpringCrud.Service;

import com.rohit.SpringCrud.Model.Ticket;
import com.rohit.SpringCrud.dao.TicketDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TicketServiceImpl implements TicketService{

    @Autowired
    private TicketDao ticketDao;

    @Override
    public String bookTicket(List<Ticket> tickets) {
        ticketDao.saveAll(tickets);
        return "Succesfully booked tickets"+tickets.size();
    }

    @Override
    public List<Ticket> getTickets() {
        return (List<Ticket>)ticketDao.findAll();
    }

    @Override
    public Optional<Ticket> getTicket(Integer ticketId) {
        return (Optional<Ticket>) ticketDao.findById(ticketId);
    }

    pu
}
