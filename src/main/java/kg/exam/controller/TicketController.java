package kg.exam.controller;

import kg.exam.entity.Session;

import kg.exam.entity.Ticket;
import kg.exam.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PostMapping
    public Ticket create(@RequestBody Ticket ticket){
        return ticketService.create(ticket);
    }

}
