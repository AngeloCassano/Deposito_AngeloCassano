package com.example.Libreria.repository;

import com.example.Libreria.model.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibreriaRepository extends CrudRepository<Libro, Long> {
    // Tutti i metodi CRUD già pronti!
}