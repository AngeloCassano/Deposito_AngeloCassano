import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EsercizioMissioneSpaziale {
    public static void main(String[] args) {
    Scanner scannerNum = new Scanner(System.in);
    Scanner scannerStr = new Scanner(System.in);
    // creato gli scanner
    StazioneSpaziale sp = new StazioneSpaziale(); //creo una stazione spaziale
    ArrayList<Astronauta> listaAstronauti = new ArrayList<>(); //creo la lisa degli astronauti
    boolean login = false;    
    int codice; //valore del comando selezionato
    String continua = new String(); // stringa per continuare
        
        do {
            System.out.println("Inserisci il codice per l'operazione desiderata:");
            System.out.println("1 crea un nuovo astronauta"); 
            System.out.println("2 visualizza i dati dell'astronauta");
            System.out.println("3 Effettua login");
            System.out.println("4 logout");//stampa menu
            codice = scannerNum.nextInt(); //input del codice selezionato
            switch (codice) {
                case 1: //crea nuovo astronauta
                    System.out.println("Inserisci il nome dell'atronauta"); //stampa messaggio
                    String nome = scannerStr.nextLine(); //input del nome
                    System.out.println("Inserisci l'email dell'astronauta");//stampa messaggio
                    String email = scannerStr.nextLine(); //input dell'email
                    listaAstronauti.add(new Astronauta(nome, email)); //aggiungo il nuovo astronauta alla lista
                    break;
            
                case 2: //visualizza dati astronauta
                    int posizione; //posizione dell'astronauta nella lista
                    do{ 
                        System.out.println("Inserisci il numero dell'astronauta nella lista. numero>0");
                        posizione = scannerNum.nextInt(); //input posizione
                        if(posizione>0 && posizione<listaAstronauti.size()){
                            System.out.println(listaAstronauti.get(posizione));// stampo i dati dell'astronauta
                        }else{
                            System.out.println(("Valore della posizione errato")); //stampa messaggio
                        }
                    }while (posizione<1 && posizione>listaAstronauti.size());
                     break;

                case 3: //login
                    System.out.println("Inserisci il nome dell'astronauta");
                    String nomeLogin = scannerStr.nextLine();
                    System.out.println("Inserisci l'email dell'astronauta");

                    break;
                    
                case 4: //logout
                    login= false;
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

class Astronauta{

    private String nome;
    private String email;
    private float creditoOssigeno ;
    //attributi della classe

    String getNome(){ // get del nome
        return this.nome;
    }

    String getMail (){ //get dell'email
        return this.email;
    }

    float getCreditoOssigeno (){ //get del credito di ossigeno
        return this.creditoOssigeno;
    }


    Astronauta(String nome, String email){ //costruttore di astronauta
        this.nome = nome;
        this.email = email;
        Random random = new Random();
        this.creditoOssigeno = random.nextFloat() *100;

    }

    boolean loginAstronauta(String nome, String email){ //metodo di login per gli astronauti
        if(this.nome.equals(nome) && this.email.equalsIgnoreCase(email)){
            Random random = new Random();
            creditoOssigeno = random.nextFloat() *100;
            //random.nextFloat(0.01f, 100.00f);
            return true;
        }else {
            return false;
        }
    }

    public String toString(){ //sovrascrivo toString
        return "astronauta: "+this.nome+" email: "+this.email+ "credito di ossigeno: "+ this.creditoOssigeno;
        
    }


}

class StazioneSpaziale{
    private ArrayList<String> esperimenti = new ArrayList<>();
    //array dei nomi degli epserimenti

    private ArrayList<Integer> valutazioni = new ArrayList<>();
    //array delle valutazioni numeriche per esperimento

     ArrayList<String> getEsperimenti (){ // get di esperimenti
        return this.esperimenti;
     }

     ArrayList<Integer> getValutazioni(){ //get di valutazioni
        return this.valutazioni;
     }

}

class Scienziato extends Astronauta{

    Scienziato(String nome, String email) { //costruttore di scienziato
        super(nome, email);
        //TODO Auto-generated constructor stub
    }

    void addEsperimento(StazioneSpaziale sp, String esperimento){ //aggiunge un esperimento alla lista
        ArrayList<String> esperimenti = sp.getEsperimenti(); //richiamo get esperimenti per ottenere la lista
        esperimenti.add(esperimento); //aggiunge l'esperimento
        
    }


}

class Ispettore extends Astronauta {

    Ispettore(String nome, String email) { //costruttore di Ispettore
        super(nome, email);
        //TODO Auto-generated constructor stub
    }

    void addValutazione(StazioneSpaziale sp, String esperimento, int valutazione ){ //aggiunge una valutazione all'esperimento passato come parametro
    if(valutazione>=1 && valutazione<=5){
        ArrayList<String> esperimenti = sp.getEsperimenti(); //richiamo get esperimenti per ottenere la lista
        if(esperimenti.contains(esperimento)){
            int posizione = esperimenti.indexOf(esperimento);
            ArrayList<Integer> valutazioni = sp.getValutazioni(); //richiamo get valutazioni per ottenere la lista
            valutazioni.add(posizione, valutazione); //aggiungo la valutazione nell'inidice in posizione
        }else{
            System.out.println("Nome sperimento non trovato"); //stampa messaggio errore
        }
    }else{
        System.out.println("Valore numerico della valutazione non valido , inserire un numero tra 1 e 5"); //stampa messaggio di errore
    }

    }
    
}