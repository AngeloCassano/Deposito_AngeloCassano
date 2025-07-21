package com.example.demo.controller;

import com.example.demo.model.Numero;
import com.example.demo.model.Prodotto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/numeri")
public class NumeroController {

    private List<Numero> numeri = new ArrayList<>();
    private Long idCounter = 1L;

    @GetMapping
    public List<Numero> getAll() {
        return numeri;
    }



    @PostMapping
    public ResponseEntity<Numero> crea(@RequestBody Numero nuovo) {
        nuovo.setId(idCounter++);
        numeri.add(nuovo);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuovo);
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Numero> getById(@PathVariable Long id) {
    return numeri.stream()
        .filter(n -> n.getId().equals(id))
        .findFirst()
        .map(ResponseEntity::ok) // status 200 OK con il prodotto
        .orElse(ResponseEntity.notFound().build()); // status 404
}

    @PutMapping("/{id}")
    public ResponseEntity<Numero> aggiorna(@PathVariable Long id, @RequestBody Numero modificato) {
        for (Numero n : numeri) {
            if (n.getId().equals(id)) {
                n.setValore(modificato.getValore());
                return ResponseEntity.ok(n);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public String elimina(@PathVariable Long id) {
        numeri.removeIf(n -> n.getId().equals(id));
        return "Numero eliminato con successo.";
    }

    @GetMapping("/somma")
    public int sumAll() {
        int sum=0;
        for (Numero n : numeri) {
            sum+=n.getValore();
        }
        return sum;
    }
}