import java.util.Scanner;



public class EsempioClassi2 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("I tre moschettieri", "Dumas", 15.90);
        Libro libro2 = new Libro("I promessi sposi", "Manzoni", 9.99);
        //creo gli oggetti
        libro1.mostraInfo();
        libro2.mostraInfo();
        //richiamo la funzione mostrainfo per i due oggetti
        Libro.stampacodicenumerico();
        //richiamo la funzione statica di Libro
        Scanner scannerStr = new Scanner(System.in); // creo oggetto scanner
        System.out.println("Inserisci il nome: ");
        String nome = scannerStr.nextLine(); //input del nome
        System.out.println("Inserisci la città : ");
        String citta = scannerStr.nextLine(); //input della città
        Persona p1 = new Persona(nome, citta); //creo oggetto
        System.out.println("Inserisci il nome: ");
        String nome2 = scannerStr.nextLine(); //input del nome
        System.out.println("Inserisci la città : ");
        String citta2 = scannerStr.nextLine(); //input della città
        Persona p2 = new Persona(nome2, citta2); //creo oggetto
        p1.mostraInfo(); //chiamo metodo
        p2.mostraInfo(); //chiamo metodo 
        
    }
}

class Libro{
    String titolo;
    String autore;
    double prezzo;
    //attributi
    static int codice_numerico_autoincrementante =0;
    //attributo statico


    Libro(String titolo, String autore, double prezzo){ //costruttore 
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        codice_numerico_autoincrementante++;
    }

    void mostraInfo(){ //stampa i valori degli attributi
        System.out.println(titolo + " - "+ autore + " - " + prezzo);
    }

    static void stampacodicenumerico(){ //stampa il contatore
       System.out.println("il numero di libri è: " + codice_numerico_autoincrementante);;
    }   
}   

    class Persona {
        String nome;
        int eta;
        String citta;
        //attributi

        Persona (String nome, String citta){ //costruttore
            this.nome = nome;
            this.citta= citta;
            eta=21;
        }

        void mostraInfo (){ //stampa dei valori degli attributi
            System.out.println("nome: "+ nome+ " - città: "+ citta + " - età: "+ eta);
        }
    }

