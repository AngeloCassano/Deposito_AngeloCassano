import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioBiblioteca {
    public static void main(String[] args) {
        /* test punto 1 e 2
        Book libro1 = new Book("I tre moschettieri", "Dumas");
        libro1.displayBookInfo();
        Library libreria1  = new Library();
        libreria1.addBook(libro1);
        libreria1.displayBooks();
        libreria1.borrowBook("I tre moschettieri"); */
        Scanner scannerNum = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        // creato gli scanner
        Library biblioteca  = new Library(); //creato oggetto libreria
        int codice; //valore del comando selezionato
        String continua = new String(); // stringa per continuare
        
        do {
            System.out.println("Inserisci il codice per l'operazione desiderata: 1 aggiungi libro, 2 stampa tutti i libri, 3 prendi in prestito un libro"
            +"4 restituisci un libro");//stampa messaggio
            codice = scannerNum.nextInt(); //input del codice selezionato
            switch (codice) {
                case 1:
                    String risposta = new String();
                    do{
                        System.out.println("Inserisci il titolo del libro da inserire: "); //stampa messaggio
                        String titolo = scannerStr.nextLine(); //input del titolo
                        System.out.println("Inserisci il nome dell'autore"); //stampa messaggio
                        String autore = scannerStr.nextLine(); //input dell'autore
                        biblioteca.addBook(new Book(titolo, autore)); //inserisco il libro nella biblioteca
                        System.out.println("vuoi continuare ad inserire libri? (si/no)"); //stampa messaggio
                        risposta = scannerStr.nextLine(); // input della rispostaS
                    }while(!risposta.equals("no")); // cicla se non ho inserito no
                    break;
            
                case 2:
                    System.out.println("L'elenco dei libri è: ");//stampa messaggio
                    biblioteca.displayBooks(); //richiamo displaybooks
                    break;

                case 3:
                    System.out.println("Inserisci il titolo del libro che vuoi prendere in prestito"); //stampa messaggio
                    biblioteca.borrowBook(scannerStr.nextLine()); //cerco di prendere in prestito il libro della stringa inserita
                    break;
                    
                case 4: 
                    System.out.println("Inserisci il titolo del libro che vuoi restituire"); //stampa messaggio
                    biblioteca.returnBook(scannerStr.nextLine()); //cerco di restituire il libro della stringa inserita
                    break;
                default:
                    System.out.println("Codice dell'operazione errato"); //stampa codice non presente
                    break;
            }

            System.out.println("vuoi continuare? (si/no)"); //chiedo se vuole continuare
            continua = scannerStr.nextLine(); //input della risposta
        }while (!continua.equals("no")); //ciclo finchè continua è diverso da no

    }
}

class Book{
    String title;
    String author;
    boolean isAvailable;
    //parametri della classe

    //costruttore della classe 
    Book (String title, String author){
        this.title = title;
        this.author = author;
        isAvailable= true;
    }
    void displayBookInfo(){ // stampa delle info del libro
        System.out.println("Titolo:"+ title + " Autore:"+ author + " Disponibilità:"+ isAvailable);
    }
}

class Library{
    ArrayList<Book> libri = new ArrayList<>(); //lista dinamica dei libri

    //costruttore

    //aggiunge un libro alla biblioteca
    void addBook(Book book){
        libri.add(book);
    }

    //stampa le info di tutti i libri presenti in biblioteca
    void displayBooks(){
        for(Book book : libri){
            book.displayBookInfo();
        }
    }

    //metodo che permette di prendere in prestito i libri
    void borrowBook(String title){
        for(Book book : libri){ //ciclo for each sull'ArrayList dei libri
            if(book.title.equals(title)){ //se il titolo del libro è quello inserito in input
                if(book.isAvailable){ //se il libro è disponibile
                book.isAvailable = false; //cambio il valore booleano per non più disponibile
                System.out.println("Hai preso in prestito il libro: "+ title); //stampo messaggioa avvenuta prenotazione
                }else{
                System.out.println("Libro già in prestito"); // stampo messaggio per indicare la non siponibilità
            }
            break; // se ho trovato il libro esco dal for
            }
        }
        
    }

    void returnBook(String title){
        for(Book book : libri){ //ciclo for each sull'ArrayList dei libri
            if(book.title.equals(title)){ //se il titolo del libro è quello inserito in input
                if(!book.isAvailable){ //se il libro non è disponibile
                book.isAvailable = true; //cambio il valore booleano in disponibile
                System.out.println("Hai restituito il libro: "+ title); //stampo messaggio libro disponibile
                }else{
                System.out.println("Libro già disponibile"); // stampo messaggio il libro era già disponibile
            }
            break; // se ho trovato il libro esco dal for
            }
        }
    }

    void searchBook(String keyword){
        for(Book book : libri){ //ciclo for each sull'ArrayList dei libri
            if(book.title.equals(keyword)){ //se il titolo è uguale alla stringa in input
                System.out.println("Il libro che hai cercato è: "); //stampa messaggio
                book.displayBookInfo(); 
                break; //esco dal ciclo for
            }
            System.out.println("Libro non trovato"); //stampa messaggio
    }   
    }
}