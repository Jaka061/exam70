package kg.exam.service;

import kg.exam.entity.Film;
import kg.exam.repository.SessionRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SessionServiceIml implements SessionService {
    @Autowired
    private SessionRepository sessionRepository;


    @Override
    public Session create(kg.exam.entity.Session session) {
        return sessionRepository.save(session);
    }

    @Override
    public List<Session> getAllSessionByCinemaId(Long cinemaId) {
        return sessionRepository.findAllSessionByCinemaId(cinemaId);
    }

    @Override
    public List<Session> getAll3DSessionByCinemaId(Boolean is3D ,Long cinemaId) {
        return sessionRepository.findAll3DSessionByCinemaId(is3D,cinemaId);
    }

    @Override
    public List<Session> getAllByDateTime(Long cinemaId , LocalDateTime time) {
        return sessionRepository.findAllByDateTime(cinemaId , time);
    }

    @Override
    public List<Session> getAllSessionByFilm(Film name) {
        return sessionRepository.findAllSessionByFilm(name);
    }
}
