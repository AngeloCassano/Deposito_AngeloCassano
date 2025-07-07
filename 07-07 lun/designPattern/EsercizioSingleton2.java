package designPattern;

import java.util.Scanner;

public class EsercizioSingleton2 {
    public static void main(String[] args) {
       /*  DatabaseManager dbm1 = DatabaseManager.getInstance(); //creo la mia istanza di database manager
        dbm1.connect(); // stabilisco una connessione con dbm1
        DatabaseManager dbm2 = DatabaseManager.getInstance(); //creo un' istanza di database manager
        dbm2.connect(); // stabilisco una connessione con dbm2
        DatabaseManager dbm3 = DatabaseManager.getInstance(); //creo un'istanza di database manager
        dbm3.connect(); // stabilisco una connessione con dbm3
        if(dbm1.equals(dbm2)&& dbm1.equals(dbm3)){ // se i tre oggetti hanno lo stesso riferimento
            System.out.println("L'istanza memorizzata nei tre oggetti è sempre la stessa"); //stampo messaggio
        }else{
            System.out.println("Non sono la stessa istanza");
        }
        System.out.println("Il numero di connessioni è: "+dbm1.getCounterConnections());
    */
    Scanner scannerNum = new Scanner(System.in);
    Scanner scannerStr = new Scanner(System.in);
    // creato gli scanner
    int codice; //valore del comando selezionato
    String continua = new String(); // stringa per continuare
    DatabaseManager dbm= null; //creo una variabile di tipo database manager    
        do {
            System.out.println("Inserisci il codice per l'operazione desiderata:");
            System.out.println("1 crea un database manager"); 
            System.out.println("2  connettiti ad un db");
            System.out.println("3 cancella il database manager");
            //stampa menu
            codice = scannerNum.nextInt(); //input del codice selezionato
            switch (codice) {
                case 1://"crea un database manager"
                    dbm = DatabaseManager.getInstance(); //istanzio dbm
                    System.out.println("Creato il databaseManager");
                    break;
            
                case 2://"connettiti ad un db"
                    dbm.connect(); //connetto ad un db
                    System.out.println("Creata la connessione al db");
                    System.out.println("Numero di connessioni attive: " +dbm.getCounterConnections());
                    
                    break;

                case 3://"cancella il database manager"
                    dbm.closeConnection(); //chiudo la connessione e rilascio l'istanza
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

class DatabaseManager{

    private static DatabaseManager instance; //istanza singola di DatabaseManagar da istanziare
    private int counterConnections =0; //contatore delle connessioni

    private DatabaseManager(){}; //costruttore privato di database manager

    public static DatabaseManager getInstance(){
        if(instance==null){ // se instance non è ancora stato instanziato
            instance = new DatabaseManager(); //lo instanzio
        }
        return instance; //restituisco l'istanza
    }


    public int getCounterConnections() { // get del contatore di connessioni
        return counterConnections;
    }

    public void setCounterConnections(int counterConnections) { // set del contatore di connessioni
        this.counterConnections = counterConnections;
    }

    public void connect(){  //simulo una connessione ad un DB
        instance.setCounterConnections(instance.getCounterConnections()+1); //incremento il contatore di connessioni
        System.out.println("Connessione stabilita. Connessioni attive: "+getCounterConnections()); //stampo un messaggio

    }

    public void closeConnection(){ //chiudo la connessione al db e rilascio l'istanza
        instance = null; // assegno null all'istanza
        System.gc(); // richiamo il garbage collector
        System.out.println("Connessione chiusa con successo. Istanza liberata");
    }


}