package com.projektwochejf.ticketsystem.controller;

import com.projektwochejf.ticketsystem.model.Raum;
import com.projektwochejf.ticketsystem.repository.RaumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class RaumController {

    @Autowired
    private RaumRepository raumRepository;

    @PostMapping("/raum")
    Raum newRaum(@RequestBody Raum newRaum){
        return raumRepository.save(newRaum);
    }

    @GetMapping("/raums")
    List<Raum> getAllRaums() {
        return  raumRepository.findAll();
    }

}
