import java.util.Scanner;

public class ProvaCondizioni1 {
    public static void main(String[] args) {
        int eta;
        boolean bigliettovalido, adulto, saltafila;
        String mezzo = new String();
        //dichiaro le variabili da utilizzare
        Scanner myScanner = new Scanner(System.in);
        //creo un oggetto scanner per acquisire i dati
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("Inserisci la tua eta'");
        eta = myScanner.nextInt();
        //richiedo l'età e l'acquisisco tramite scanner
        System.out.println("Quale mezzo vuoi utilizzare taxy o bus?");
        mezzo = myScanner2.nextLine();
        //richiedo quale mezzo vuole utilizzare e lo memorizzo
        System.out.println("Possiedi un biglietto valido?");
        bigliettovalido = myScanner.nextBoolean();
        //richiedo se il biglietto e valido e memorizzo nella variabile booleana la risposta
        System.out.println("Sei un adulto?");
        adulto = myScanner.nextBoolean();
        //richiedo se accompagnato e memorizzo nella variabile booleana
        System.out.println("Vuoi acquistatare l'opzione 'Salta la fila' ?");
        saltafila = myScanner.nextBoolean();
        //richiedo se l'opzione salta la fila è stata scelta e memorizzo nella variabile booleana
        
        System.out.println("L'età inserita è "+ eta);
        //output del valore di eta

        if (mezzo.equals("bus")) {  // condizione sul tipo di mezzo 
                if(bigliettovalido){
                System.out.println("Il tuo biglietto è valido");
            }else{
            System.out.println("Il tuo biglietto non è valido");
        }
        //controllo se il biglietto e valido e stampo la risposta corrispondente al risultato della condizione

        if(adulto){
            System.out.println("Il biglietto è per un adulto");
        }else{
            System.out.println("Il biglietto non è per un adulto");
        }
        //controllo se il biglietto è per un adulto e stampo la risposta corrispondente al risultato della condizione

        if(saltafila){
            System.out.println("Hai scelto di saltare la fila");

        }else{
            System.out.println("Hai scelto di non saltare la fila");
        
        }
        //controllo della condizione e stampo la risposta corrispondente al risultato

        } else{

        }
        
    }
}
