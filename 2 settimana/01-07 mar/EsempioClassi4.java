import java.util.ArrayList;
import java.util.Scanner;

public class EsempioClassi4 {

    public static void main(String[] args) {
        Auto4 a1 = new Auto4("af345bc", "supra"); //creo un primo oggetto auto
        Auto4 a2 = new Auto4("bc377nh", "focus");//creo un secondo oggetto auto
        Officina off = new Officina(); //creo un oggetto officina
        off.addAuto(a1); //aggiungo a1 all'officina
        off.addAuto(a2); //aggiungo a2 all'officina
        off.displayAuto(); //richiamo displayAuto per stampare tutte le auto
        Scanner scannerStr = new Scanner(System.in); //creo uno scanner per le stringhe
        String risposta = new String(); //creo la stringa risposta
        do{
            String risposta2 = new String();
            do{
                System.out.println("Inserisci la targa dell'auto da inserire"); //stampa messaggio richiesta targa
                String targa = scannerStr.nextLine(); //input della targa da utente
                System.out.println("Inserisci il modello dell'auto da inserire"); //stampa messaggio richista modello
                String modello = scannerStr.nextLine(); //input del modello da utente
                off.addAuto(new Auto4(targa, modello)); //aggiungo un oggetto auto all'officina con le info prese in input
                System.out.println("Vuoi inserire un altra auto? (si/no)"); //chieso se vuole continuare ad aggiungere auto
                risposta2 = scannerStr.nextLine(); // input della risposta se vuole continuare 
            }while (!risposta2.equals("no")); // se la risposta non è no continua a ciclare
            System.out.println("Vuoi stampare tutte le auto dell'officina? (si/no)");
            risposta2 = scannerStr.nextLine();
            if(risposta2.equals("si")){
                off.displayAuto(); //richiamo metofo displayAuto per stampare l'elenco delle auto in officina
            }
            
            System.out.println("Vuoi continuare ad effettuare operazioni? (si/no)"); //stampa messaggio se vuole effettuare altre operazioni
            risposta = scannerStr.nextLine(); //prendo una stringa di risposta in input
            

        }while (!risposta.equals("no"));
        

    }





}


class Auto4{
    String targa; // attributo targa
    String modello; //attributo modello

    //costruttore con parametri
    Auto4(String targa, String modello){
        
        this.targa = targa; //assegno la targa
        this.modello = modello;//assegno il modello

    }

}


class Officina{
    ArrayList<Auto4> automobili = new ArrayList<>(); // arraylist delle automobili

    //aggiungo un auto all'officina
    void addAuto(Auto4 auto){// metodo che aggiunge un auto
        this.automobili.add(auto); //aggiungo auto all'arraylisyt
    }

    //stampo tutte le auto nell'officina
    void displayAuto(){
        System.out.println("Questo è l'elenco di tutte le automobili");// stampa messaggio
        for(Auto4 auto : automobili){ //for each sugli elementi di automobili
            System.out.println("Auto con targa: "+auto.targa+" del modello: "+auto.modello); //stampo le auto presenti
        }
    }


    
}