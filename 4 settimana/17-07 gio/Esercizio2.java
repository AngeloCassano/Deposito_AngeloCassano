package com.example;

import java.sql.*; // import delle classi necessarie per la connessione al DB 
import java.util.Scanner; // import della classe Scanner
        
        public class Esercizio2 {
            public static void main(String[] args) {

            String url = "jdbc:mysql://localhost:3306/sakila"; // sostituire con il nome del DB
            try(Scanner scannerNum = new Scanner(System.in); Scanner scannerStr = new Scanner(System.in)){// creato gli scanner all'interno di un try with resources
            int codiceConnessione; //valore del comando selezionato
            String continuaConnessione = new String(); // stringa per continuare
            Connection conn; // Oggetto di tipo connessione che conterrà la mia connessione al db
            do {
            System.out.println("Inserisci il codice per l'operazione desiderata:");
            System.out.println("1  effettua la connessione con il DB tabella sakila"); 
            //stampa menu
            codiceConnessione = scannerNum.nextInt(); //input del codice selezionato
            switch (codiceConnessione) {
                case 1://
                System.out.println("Inserisci il nome utente");
                String user = scannerStr.nextLine();       // prendo in input il nome utente del DB
                System.out.println("Inserisci la password");
                String password = scannerStr.nextLine();       // prendo in input password del DB
                try{
                    conn = DriverManager.getConnection(url, user, password); //creo una connessione al DB e inserisco il riferimento in conn
                    System.out.println("Connessione riuscita"); // messaggio di conenssione riuscita
                    
                    int codiceOperazione; //valore del comando selezionato
                    String continuaOperazioni = new String(); // stringa per continuare

                     do {
                        System.out.println("1  Recuperare tutti i clienti con nome che inizia per lettera A"); 
                        System.out.println("2  Contare quanti clienti sono registrati in ogni città (city)");
                        System.out.println("3  Mostrare i 5 clienti più recenti (per data di create_date)"); 
                        System.out.println("4  Ordinare tutti i clienti dal più vecchio al più recente e visualizzarli con nome e data.");
                        //stampa menu
                        codiceOperazione = scannerNum.nextInt(); //input del codice selezionato
                        switch (codiceOperazione) {
                        case 1://
                            Statement stmtOp1 = conn.createStatement(); // creo uno statement a cui passerò la query
                            ResultSet rsOp1 = stmtOp1.executeQuery("SELECT customer.first_name FROM customer WHERE customer.first_name LIKE 'A%';");
                            //assegno il testo della query, la eseguo e passo il risultato al resultset
                            while(rsOp1.next()) //scansiono le righe del resultset
                        {
                            System.out.println("Nome:" +rsOp1.getString("customer.first_name")); //Stampo il valore nella colonna passata come parametro
                        }
                        break;
            
                        case 2://
                            Statement stmtOp2 = conn.createStatement(); // creo uno statement a cui passerò la query
                            ResultSet rsOp2 = stmtOp2.executeQuery("SELECT city.city, count(*) AS NumeroClienti\n" 
                            +"FROM customer\n"
                            +"INNER JOIN address on customer.address_id = address.address_id\n"
                            +"INNER JOIN city on city.city_id = address.city_id\n"
                            +"GROUP BY city.city\n"
                            +"ORDER BY NumeroClienti DESC;");
                            //assegno il testo della query, la eseguo e passo il risultato al resultset
                            while(rsOp2.next()) //scansiono le righe del resultset
                        {
                        {
                            System.out.println("Film:" +rsOp2.getString("city.city")); //Stampo il valore nella colonna passata come parametro
                            System.out.println("Numero di noleggi:" +rsOp2.getString("NumeroClienti"));//Stampo il valore nella colonna passata come parametro
                        }
                        break; 

                        case 3://
                            Statement stmtOp3 = conn.createStatement(); // creo uno statement a cui passerò la query
                            ResultSet rsOp3 = stmtOp3.executeQuery("SELECT customer.first_name, customer.last_name, customer.create_date\n"+
                                                            "FROM customer\n"+ 
                                                            "ORDER BY customer.create_date ASC\n"+
                                                            "LIMIT 5;");
                            //assegno il testo della query, la eseguo e passo il risultato al resultset
                            while(rsOp3.next()) //scansiono le righe del resultset
                        {
                            System.out.println("Nome:" +rsOp3.getString("customer.first_name")); //Stampo il valore nella colonna passata come parametro
                            System.out.println("Cognome:" +rsOp3.getString("customer.last_name")); //Stampo il valore nella colonna passata come parametro
                            System.out.println("Data creazione:" +rsOp3.getString("customer.create_date")); //Stampo il valore nella colonna passata come parametro
                        }
                        break;

                        case 4://
                            Statement stmtOp4 = conn.createStatement(); // creo uno statement a cui passerò la query
                            ResultSet rsOp4 = stmtOp4.executeQuery("SELECT customer.first_name, customer.last_name, customer.create_date\n"+
                                                            "FROM customer\n"+ 
                                                            "ORDER BY customer.create_date DESC");
                            //assegno il testo della query, la eseguo e passo il risultato al resultset
                            while(rsOp4.next()) //scansiono le righe del resultset
                        {
                            System.out.println("Nome:" +rsOp4.getString("customer.first_name")); //Stampo il valore nella colonna passata come parametro
                            System.out.println("Cognome:" +rsOp4.getString("customer.last_name")); //Stampo il valore nella colonna passata come parametro
                            System.out.println("Data creazione:" +rsOp4.getString("customer.create_date")); //Stampo il valore nella colonna passata come parametro
                        }
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