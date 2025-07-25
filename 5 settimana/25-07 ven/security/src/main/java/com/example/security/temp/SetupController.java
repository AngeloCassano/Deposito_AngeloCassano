package com.example.security.temp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.model.Utente;
import com.example.security.repository.UtenteRepository;

@RestController
@RequestMapping("/setup")
public class SetupController {

    @Autowired
    private UtenteRepository repo;
    @Autowired
    private PasswordEncoder encoder;

    @PostMapping("/admin")
    public String creaAdmin() {
        if (repo.findByUsername("admin").isEmpty()) {
            Utente u = new Utente();
            u.setUsername("admin");
            u.setPassword(encoder.encode("admin123"));
            u.setRuolo("ADMIN");
            repo.save(u);
        }
        return "Utente admin creato";
    }
}