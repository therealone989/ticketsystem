package com.projektwochejf.ticketsystem.controller;

import com.projektwochejf.ticketsystem.model.LoginResponse;
import com.projektwochejf.ticketsystem.model.User;
import com.projektwochejf.ticketsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return  userRepository.findAll();
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User loginUser) {
        // Hier Logik zur Überprüfung der Anmeldedaten
        // Zum Beispiel, Überprüfen, ob ein Benutzer mit der E-Mail existiert und ob das Passwort übereinstimmt
        // Wenn erfolgreich, generieren Sie ein Token und geben dieses zurück

        // Beispiel-Implementierung (Sie müssen hier Ihre eigene Logik einfügen)
        User user = userRepository.findByEmail(loginUser.getEmail());
        if (user != null && user.getPasswort().equals(loginUser.getPasswort())) {
            // Authentifizierung erfolgreich
            // Token generieren und zurückgeben (Token-Generierung hier nicht implementiert)
            return ResponseEntity.ok(new LoginResponse(user.getUserId(), user.getRolle()));
        } else {
            // Authentifizierung fehlgeschlagen
            return ResponseEntity.badRequest().body("Ungültige Anmeldedaten");
        }
    }

}
