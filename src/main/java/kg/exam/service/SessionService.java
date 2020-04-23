package kg.exam.service;

import kg.exam.entity.Cinema;
import kg.exam.entity.Film;
import kg.exam.entity.Session;


import java.time.LocalDateTime;
import java.util.List;

public interface SessionService {
    Session create(Session session);
    List<Session> getAllSessionByCinemaId(Long cinemaId);
    List<Session> getAll3DSessionByCinemaId(Boolean is3D ,Long cinemaId);
    List<Session> getAllByDateTime(Long cinemaId , LocalDateTime time);
    List<Session> getAllSessionByFilm(Film name );
}
