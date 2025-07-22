package com.example.ToDoList.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter 
@Setter
public class Todo {
    private Long id;
    private String descrizione;
    private boolean completato;

}
