package kg.exam.service;

import kg.exam.entity.Ticket;
import kg.exam.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceIml implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Override
    public Ticket create(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
