package com.projektwochejf.ticketsystem.controller;

import com.projektwochejf.ticketsystem.model.LoginResponse;
import com.projektwochejf.ticketsystem.model.User;
import com.projektwochejf.ticketsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        try {
            // Hashing des Passworts
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(newUser.getPasswort().getBytes(StandardCharsets.UTF_8));
            String hashedPasswort = bytesToHex(hash);

            newUser.setPasswort(hashedPasswort);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            // Geeignete Fehlerbehandlung hier
        }

        return userRepository.save(newUser);
    }

    private String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
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
        if (user != null) {
            // Hashen des eingegebenen Passworts
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] hash = digest.digest(loginUser.getPasswort().getBytes(StandardCharsets.UTF_8));
                String hashedInputPasswort = bytesToHex(hash);

                // Überprüfen, ob das gehashte Passwort mit dem in der Datenbank gespeicherten übereinstimmt
                if (user.getPasswort().equals(hashedInputPasswort)) {
                    // Authentifizierung erfolgreich
                    return ResponseEntity.ok(new LoginResponse(user.getUserId(), user.getRolle()));
                }
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                // Geeignete Fehlerbehandlung hier
            }
        }
        // Authentifizierung fehlgeschlagen
        return ResponseEntity.badRequest().body("Ungültige Anmeldedaten");
    }

}
