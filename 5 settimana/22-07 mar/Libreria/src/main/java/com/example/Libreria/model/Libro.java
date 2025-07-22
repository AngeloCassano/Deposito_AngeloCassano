package com.example.Libreria.model;
import lombok.*;
import jakarta.persistence.*;


@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titolo;
    private String autore;
    private double prezzo;

    public Libro() {}

    public Libro(String titolo, String autore, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }
}
