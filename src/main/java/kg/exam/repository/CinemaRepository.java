package kg.exam.repository;

import kg.exam.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema ,Long> {
    List<Cinema> findAllBoughtTickets(Long id, Cinema password);
}
