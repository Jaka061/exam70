package kg.exam.service;

import kg.exam.entity.Client;
import kg.exam.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceIml implements ClientService{

    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client boughtTicket(Client age, Boolean isBought, Boolean isMoreThan16) {
        return clientRepository.boughtTicket(age,isBought,isMoreThan16);
    }
}
