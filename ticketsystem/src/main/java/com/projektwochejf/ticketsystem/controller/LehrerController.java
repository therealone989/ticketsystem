package com.projektwochejf.ticketsystem.controller;

import com.projektwochejf.ticketsystem.model.Lehrer;
import com.projektwochejf.ticketsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class LehrerController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    Lehrer newLehrer(@RequestBody Lehrer newLehrer){
        return userRepository.save(newLehrer);
    }

    @GetMapping("/users")
    List<Lehrer> getAllUsers() {
        return  userRepository.findAll();
    }


}
