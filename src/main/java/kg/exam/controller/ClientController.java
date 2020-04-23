package kg.exam.controller;

import kg.exam.entity.Client;
import kg.exam.entity.Session;
import kg.exam.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public Client create(@RequestBody Client client){
        return clientService.create(client);
    }

    @GetMapping("/bought")
    public Client boughtTicket (@PathVariable Client age, Boolean isBought , Boolean isMoreThan16){
        return clientService.boughtTicket(age,isBought,isMoreThan16);
    }


}
