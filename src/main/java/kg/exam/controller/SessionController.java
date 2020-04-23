package kg.exam.controller;

import kg.exam.entity.Film;
import kg.exam.entity.Session;
import kg.exam.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/session")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @PostMapping
    public Session create(@RequestBody Session session){
        return sessionService.create(session);
    }

    @GetMapping("/cinemaId/{cinemaId}")
    public List<Session> getAllSessionByCinemaId(@PathVariable Long cinemaId){
        return sessionService.getAllSessionByCinemaId(cinemaId);
    }

    @GetMapping("/cinemaId/{is3D}/{cinemaId}")
    public List<Session> getAll3DSessionByCinemaId(@PathVariable Boolean is3D ,@PathVariable Long cinemaId) {
        return sessionService.getAll3DSessionByCinemaId(is3D,cinemaId);
    }

    @GetMapping("/cinemaId/{cinemaId}/{time}")
    public List<Session> getAllByDateTime(@PathVariable Long cinemaId ,@PathVariable LocalDateTime time) {
        return sessionService.getAllByDateTime(cinemaId,time);
    }

    @GetMapping("/film/{name}")
    public List<Session> getAllSessionByFilm(Film name) {
        return sessionService.getAllSessionByFilm(name);
    }


}
