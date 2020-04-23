package kg.exam.service;

import kg.exam.entity.Film;
import kg.exam.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceIml implements FilmService {
    @Autowired
    private FilmRepository filmRepository;
    @Override
    public Film create(Film film) {
        return filmRepository.save(film);
    }
}
