package kg.exam.repository;

import kg.exam.entity.Cinema;
import kg.exam.entity.Film;
import kg.exam.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
    List<org.hibernate.Session> findAllSessionByCinemaId(Long cinemaId);
    List<org.hibernate.Session> findAll3DSessionByCinemaId(Boolean is3D ,Long cinemaId);
    List<org.hibernate.Session> findAllByDateTime(Long cinemaId , LocalDateTime time);
    List<org.hibernate.Session> findAllSessionByFilm(Film name );
}
