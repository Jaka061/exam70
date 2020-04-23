package kg.exam.repository;

import kg.exam.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client boughtTicket (Client age, Boolean isBought , Boolean isMoreThan16);

}
