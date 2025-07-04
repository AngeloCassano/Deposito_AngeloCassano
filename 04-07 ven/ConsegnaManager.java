import java.util.ArrayList;
import java.util.Scanner;

public class ConsegnaManager {
    public static void main(String[] args) {
    ArrayList<VeicoloConsegna> listaVeicoli = new ArrayList<>();
    Scanner scannerNum = new Scanner(System.in);
    Scanner scannerStr = new Scanner(System.in);
    // creato gli scanner
    int codice; //valore del comando selezionato
        String continua = new String(); // stringa per continuare
        
        do {
            System.out.println("Inserisci il codice per l'operazione desiderata:");
            System.out.println("1 Inserisci veicolo"); 
            System.out.println("2 consegna pacco");
            System.out.println("3 traccia la consegna ");
            System.out.println("4 stampa le info di tutti i veicoli nella lista");//stampa menu
            codice = scannerNum.nextInt(); //input del codice selezionato
            switch (codice) {
                case 1:
                    String tipoVeicolo = new String(); //creo una stringa tipoVeicolo
                    System.out.println("Che tipo di veicolo vuoi aggiungere? (Furgone/drone)"); //stampa messaggio
                    tipoVeicolo = scannerStr.nextLine();
                    if(tipoVeicolo.equalsIgnoreCase("furgone")){
                        System.out.println("Inserisci la targa"); //stampa messaggio
                        String targa = scannerStr.nextLine(); //input della targa
                        System.out.println("Inserisci il carico massimo"); //stampa messaggio
                        int caricoMassimo = scannerNum.nextInt(); //input del carico massimo
                        listaVeicoli.add(new Furgone(targa, caricoMassimo)); // aggiungo il furgone alla lista dei veicoli
                    }else if (tipoVeicolo.equalsIgnoreCase("drone")){
                         System.out.println("Inserisci la targa"); //stampa messaggio
                        String targa = scannerStr.nextLine(); //input della targa
                        System.out.println("Inserisci il carico massimo"); //stampa messaggio
                        int caricoMassimo = scannerNum.nextInt(); //input del carico massimo
                        listaVeicoli.add(new Drone(targa, caricoMassimo)); //aggiungo il drone alla lista dei veicoli
                    }

                    break;
            
                case 2:
                    String destinazione = new String();
                    System.out.println("Inserisci la destinazione dove consegnare il pacco");
                    destinazione = scannerStr.nextLine();
                    System.out.println("Inserisci il numero di targa del veicolo");
                    String targa = scannerStr.nextLine();
                    for(VeicoloConsegna veicolo : listaVeicoli){
                        if(veicolo.)
                    }
                    break;

                case 3:
                    
                    break;
                    
                case 4: 
                    for(VeicoloConsegna veicolo : listaVeicoli){
                        veicolo.stampaInfo();
                    }
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

abstract class  VeicoloConsegna {
    String targa; 
    float caricoMassimo;
    //attributi della classe astratta

    abstract void consegnaPacco(String destinazione); //metodo astratto consegnaPacco

    void stampaInfo(){ //stampa le info del veicolo
        System.out.println("La targa del veicolo di consegna è: "+this.targa + " e il suo carico massimo è di: "+this.caricoMassimo);
    }
}

interface Tracciabie{ //interfaccia tracciabile
    void tracciaConsegna(String codiceTracking); //metodo dell'interfaccia
}

class Furgone extends VeicoloConsegna implements Tracciabie{
    

    Furgone (String targa, int caricoMassimo){// costruttore di furgone
        this.targa = targa;
        this.caricoMassimo = caricoMassimo;
       
    }

      @Override
    void consegnaPacco(String destinazione) { //implemento il metodo astratto 
        System.out.println("Il pacco è stato consegnato alla destinazione: "+destinazione);
    }


    @Override
    public void tracciaConsegna(String codiceTracking) { //implemento il metodo dell'interfaccia
        
    } 

}

class Drone extends VeicoloConsegna implements Tracciabie{
    

    Drone (String targa, int caricoMassimo){  //costruttore di drone
        this.targa = targa;
        this.caricoMassimo = caricoMassimo;
        
    }

      @Override
    void consegnaPacco(String destinazione) { //implemento il metodo della classe astratta
         System.out.println("In volo verso la destinazione: "+ destinazione);
    }


    @Override
    public void tracciaConsegna(String codiceTracking) { //implemento il metodo dell'interfaccia
        
    } 
}
  