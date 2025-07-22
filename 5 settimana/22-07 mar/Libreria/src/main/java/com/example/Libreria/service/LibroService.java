package com.example.Libreria.service;

import com.example.Libreria.model.Libro;
import org.springframework.stereotype.Service;
import com.example.Libreria.repository.LibreriaRepository;


import java.util.*;

@Service
public class LibroService
{   
    private final LibreriaRepository repo;
    
    public LibroService(LibreriaRepository repo) {
        this.repo = repo;
    }

    public List<Libro> getAll()
    {
        List<Libro> lista = new ArrayList<>();
        repo.findAll().forEach(lista::add);
        return lista;
    }

    public Optional<Libro> getById(Long id)
    {
        return repo.findById(id);
    }

    public Libro create(Libro nuovo)
    {
        return repo.save(nuovo);
    }

    public Optional<Libro> update(Long id, Libro modificato)
    {
        return repo.findById(id).map(t -> {
            t.setTitolo(modificato.getTitolo());
            t.setAutore(modificato.getAutore());
            t.setPrezzo(modificato.getPrezzo());
            return repo.save(t);
        });
    }

    public boolean delete(Long id)
    {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}