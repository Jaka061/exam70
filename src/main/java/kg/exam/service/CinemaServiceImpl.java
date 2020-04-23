package kg.exam.service;

import kg.exam.entity.Cinema;
import kg.exam.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService{
    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public Cinema create(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

    @Override
    public List<Cinema> getAllBoughtTickets(Long id, Cinema password) {
        return cinemaRepository.findAllBoughtTickets(id,password);
    }
}
