package kg.exam.controller;

import kg.exam.entity.Cinema;
import kg.exam.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cinema")
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @GetMapping("/cinemaId/{id}/{password}")
    public List<Cinema> getAllBoughtTickets(@PathVariable Long id,@PathVariable Cinema password){
        return cinemaService.getAllBoughtTickets(id,password);
    }
}
