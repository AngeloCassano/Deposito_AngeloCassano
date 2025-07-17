package com.example;

import java.sql.*;
import java.util.Scanner;
        
        public class Esercizio1 {
            public static void main(String[] args) {

            String url = "jdbc:mysql://localhost:3306/sakila"; // sostituire con il nome del DB
            try(Scanner scannerNum = new Scanner(System.in); Scanner scannerStr = new Scanner(System.in)){// creato gli scanner all'interno di un try with resources
            int codiceConnessione; //valore del comando selezionato
            String continuaConnessione = new String(); // stringa per continuare
            Connection conn;
            do {
            System.out.println("Inserisci il codice per l'operazione desiderata:");
            System.out.println("1  effettua la connessione con il DB tabella sakila"); 
            //stampa menu
            codiceConnessione = scannerNum.nextInt(); //input del codice selezionato
            switch (codiceConnessione) {
                case 1://
                System.out.println("Inserisci il nome utente");
                String user = scannerStr.nextLine();       // utente del DB
                System.out.println("Inserisci la password");
                String password = scannerStr.nextLine();       // password del DB
                try{
                    conn = DriverManager.getConnection(url, user, password);
                    System.out.println("Connessione riuscita");
                    
                    int codiceOperazione; //valore del comando selezionato
                    String continuaOperazioni = new String(); // stringa per continuare

                     do {
                        System.out.println("Inserisci il codice per l'operazione desiderata:");
                        System.out.println("1  Recuperare i 10 film più noleggiati dalla tabella rental."); 
                        System.out.println("2  Andare ad ordinare i FILM dal meno noleggiato al più noleggiato");
                        //stampa menu
                        codiceOperazione = scannerNum.nextInt(); //input del codice selezionato
                        switch (codiceOperazione) {
                        case 1://
                            
                        break;
            
                        case 2://
                    
                        break; 
                        
                        default:
                            System.out.println("Codice dell'operazione errato"); //stampa codice non presente
                        break;
                    }

                    System.out.println("vuoi continuare? (si/no)"); //chiedo se vuole continuare
                    continuaOperazioni = scannerStr.nextLine(); //input della risposta
                    }while (!continuaOperazioni.equals("no")); //ciclo finchè continua è diverso da no



                } catch (SQLException e) {
                    System.out.println("Errore nella connessione");
                    e.printStackTrace();
                }
                    break;
            
                    
                default:
                    System.out.println("Codice dell'operazione errato"); //stampa codice non presente
                    break;
            }

            System.out.println("vuoi continuare? (si/no)"); //chiedo se vuole continuare
            continuaConnessione = scannerStr.nextLine(); //input della risposta
        }while (!continuaConnessione.equals("no")); //ciclo finchè continua è diverso da no
    } catch (Exception e) {
        e.printStackTrace();
    }        

        }}