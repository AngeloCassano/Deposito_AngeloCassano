package com.example.ToDoList.controller;

import com.example.ToDoList.model.Commento;
import com.example.ToDoList.service.CommentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commenti")
@RequiredArgsConstructor
public class CommentoController {

    private final CommentoService commentoService;

    @GetMapping
    public List<Commento> getAllCommenti() {
        return commentoService.findAll();
    }

    @GetMapping("/{id}")
    public Commento getCommentoById(@PathVariable Long id) {
        return commentoService.findById(id);
    }

    @PostMapping
    public Commento createCommento(@RequestBody Commento commento) {
        return commentoService.save(commento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCommento(@PathVariable Long id) {
        commentoService.delete(id);
        return ResponseEntity.ok("Commento eliminato");
    }
}