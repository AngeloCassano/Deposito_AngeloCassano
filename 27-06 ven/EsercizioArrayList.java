import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* Crei una ArrayList di stringhe per memorizzare nomi di
studenti.
L'utente può aggiungere nomi finché non scrive "fine".
Il programma deve stampare tutti i nomi in ordine
alfabetico.
Il programma deve dire quanti studenti sono stati inseriti.

Il programma deve permettere di eliminare degli studenti
indicati dall’utente */
public class EsercizioArrayList {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        //creo lo scanner per le stringhe
        Scanner scannerNum = new Scanner(System.in);
        //creo lo scanner per i numeri
        ArrayList<String> nomiStudenti = new ArrayList<String>();
        //creo l'array dei nomi degli studenti
        String risposta = new String();
        //creo la str risposta
        int posizione; 
        //posizione dell'elemento da cancellare

        do{
            System.out.println("Inserisci il nome dello studente o \"fine\" per terminare il caricamento dei nomi");
            risposta = scannerStr.nextLine();
            //input della stringa del nome o comando fine
            if(!risposta.equals("fine")){
                nomiStudenti.add(risposta); //aggiungo il nome all'array
            }
        }while (!risposta.equals("fine")); //finchè la risposta non è fine
        Collections.sort(nomiStudenti);
        System.out.println("L'elenco dei nomi in ordine alfabetico è :" +nomiStudenti);
        //stampo l'elenco dei nomi ordinati
        System.out.println("Il numero di studenti inseriti è: "+ nomiStudenti.size());
        //stampo il numero degli studenti
         do{
            System.out.println("Vuoi cancellare un nome?Inserisci \"si\" o \"no\" per terminare");
            risposta = scannerStr.nextLine();
            //input della posizione del nome da cancellare o comando fine
            if(risposta.equals("si")){
                System.out.println("Inserisci la posizione del nome");
                posizione = scannerNum.nextInt();
                //input della posizione del nome da cancellare
                nomiStudenti.remove(posizione-1); //rimuovo il nome nella posizione ricevuta
            }
            
        }while (!risposta.equals("no")); //finchè la risposta non è no
        System.out.println("L'elenco dei nomi dopo le cancellazioni è :" +nomiStudenti);
        //stampo l'elenco dei nomi 
        scannerNum.close();
        scannerStr.close();
        //chiusura scanner
    }
}
