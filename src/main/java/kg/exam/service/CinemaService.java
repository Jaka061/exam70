package kg.exam.service;

import kg.exam.entity.Cinema;

import java.util.List;

public interface CinemaService {
    Cinema create (Cinema cinema);
    List<Cinema> getAllBoughtTickets(Long id, Cinema password);
}
