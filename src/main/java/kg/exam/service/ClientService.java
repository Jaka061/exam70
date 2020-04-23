package kg.exam.service;

import kg.exam.entity.Client;

public interface ClientService {
    Client create (Client client);
    Client boughtTicket (Client age, Boolean isBought , Boolean isMoreThan16);

}
