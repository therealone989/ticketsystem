package com.projektwochejf.ticketsystem.controller;

import com.projektwochejf.ticketsystem.model.UsedRoom;
import com.projektwochejf.ticketsystem.repository.UsedRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UsedRoomController {

    @Autowired
    private UsedRoomRepository usedRoomRepository;

    @PostMapping("/usedroom")
    UsedRoom newUsedRaum(@RequestBody UsedRoom newUsedRaum){
        return usedRoomRepository.save(newUsedRaum);
    }

    @GetMapping("/usedrooms")
    List<UsedRoom> getAllUsedRaums() {
        return usedRoomRepository.findAll();
    }
}
