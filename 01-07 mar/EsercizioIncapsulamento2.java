import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioIncapsulamento2 {
    public static void main(String[] args) {
        CompagniaAerea ca = new CompagniaAerea(); //creo un oggetto di compagnia aerea
        Scanner scannerNum = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        // creo gli scanner
        
        System.out.println("Insersci il modello dell'aereo");
        String modello = scannerStr.nextLine();
        System.out.println("Insersci il numero dei posti dell'aereo");
        int numeroPosti = scannerNum.nextInt();
        System.out.println("Insersci il codice dell'aereo");
        String codice = scannerStr.nextLine();
        //chiedo i dati dell'aereo da inserire nella compagnia aerea
        ca.addAereo(new Aereo(modello, numeroPosti, codice)); //aggiungo l'aereo nella compagnia aerea

        
        System.out.println("Insersci il modello dell'aereo");
        String modello2 = scannerStr.nextLine();
        System.out.println("Insersci il numero dei posti dell'aereo");
        int numeroPosti2 = scannerNum.nextInt();
        System.out.println("Insersci il codice dell'aereo");
        String codice2 = scannerStr.nextLine();
        //chiedo i dati del secondo aereo da inserire nella compagnia aerea
        ca.addAereo(new Aereo(modello2, numeroPosti2, codice2));
        //aggiungo l'aereo nella compagnia aerea

        System.out.println("Inserisci il nome del pilota");
        String nomePilota = scannerStr.nextLine();
        System.out.println("Inserisci il numero di brevetto");
        String numeroBrevetto = scannerStr.nextLine();
        System.out.println("Inserisci ore di volo");
        int oreVolo = scannerNum.nextInt();
        //chiedo i dati del primo pilota da inserire nella compgnia aerea
        ca.addPilota(new Pilota(nomePilota, numeroBrevetto, oreVolo));
        //aggiungo il primo pilota nella compagnia aerea

        System.out.println("Inserisci il nome del pilota");
        String nomePilota2 = scannerStr.nextLine();
        System.out.println("Inserisci il numero di brevetto");
        String numeroBrevetto2 = scannerStr.nextLine();
        System.out.println("Inserisci ore di volo");
        int oreVolo2 = scannerNum.nextInt();
        //chiedo i dati del secondo pilota
        ca.addPilota(new Pilota(nomePilota2, numeroBrevetto2, oreVolo2));
        //aggiungo il secondo pilota alla compagnia aerea
        ca.displayInfo(); //richiamo il metodo displayinfo per stampare tutte le info di aerei e piloti
    }
}

class Aereo {
    private String modello; //attributo modello dell'aereo
    private int numeroPosti; //attributo numero posti
    private String codice; // attributo codice

    Aereo(String modello, int numeroPosti, String codice){ //costruttore parametrico di aereo
        this.modello = modello; //assegno il valore del modell
        this.numeroPosti = numeroPosti;//assegno il valore del numero di posti
        this.codice = codice; //assegno il valore di codice
    }

    void setModello(String modello){ // metodo set cambia il valore di modello
        this.modello = modello; //assegno nuovo valore
    }

    String getModello (){ //metodo get restituisco il valore di modello
        return modello;
    }

    int getNumeroPosti(){// metodo get restituisco il valore di numero posti
        return numeroPosti;
    }

    void setNumeroPosti(int numeroPosti){ //metodo set, cambio il valore di numero posti
        if(numeroPosti>0){ //se numero posti maggiore di 0
            this.numeroPosti= numeroPosti; // cambio il valore
        }else{
            System.out.println("Numero posti non valido");//stampo messaggio di errore
        }
    }

    void setCodice(String codice){ // metodo set, cambio il valore di codice
        this.codice = codice; //assegno un nuovo valore di codice
    }

    String getCodice(){ //metodo get, restituisco il valore di codice
        return codice;
    }

}

class Pilota{
    private String nome;    //attributo nome del pilota
    private String numeroBrevetto; //attributo numero di brevetto
    private int oreVolo; //attributo ore di volo

    Pilota(String nome, String numeroBrevetto, int oreVolo){ //costruttore parametrico di pilota
        this.nome = nome;   //assegna il nome
        this.numeroBrevetto = numeroBrevetto;//assegna il numero di brevetto
        this.oreVolo = oreVolo; //assegna il numero di ore di volo
    }

    void setNome(String nome){ //metodo set, cambia il valore di nome
        this.nome = nome;//cambio il valore di nome
    }

    String getNome(){ //metodo get, restituisce il valore di nome
        return nome; 
    }

    void setNumeroBrevetto(String numeroBrevetto){ //metodo set cambia il valore di numero brevetto
        this.numeroBrevetto = numeroBrevetto; //assegno il nuovo valore di numero brevetto
    }

    String getNumeroBrevetto(){ //metodo get restituisce il numero del brevetto
        return this.numeroBrevetto;
    }

    void setOreVolo (int oreVolo){ // metodo set, cambia il valore di ore volo
        if(oreVolo>0){  //se ore volo è maggiore di 0
            this.oreVolo = oreVolo; //assegno il nuovo valore di ore di volo
        }else{
            System.out.println("Valore di ore di volo non valido"); //stampa messaggio di errore
        }
        
    }

    int getOreVolo(){ //metodo get, restituisce il valore di ore di volo
        return this.oreVolo;
    }

}

class CompagniaAerea{
    private String nome;    //attributo del nome della compagnia aerea
    private ArrayList<Aereo> flotta = new ArrayList<>(); //arraylist degli aerei
    private ArrayList<Pilota> piloti = new ArrayList<>(); //arraylist dei piloti

    void addAereo(Aereo a){ //inserisce un nuovo aereo nella flotta
        flotta.add(a); //aggiungi a all'arraylist flotta
    }


    void addPilota(Pilota p){   // metodo che inserisce un nuovo pilota
        piloti.add(p);  //aggiungo il pilota p nell'arraylist piloti
    }

    void displayInfo(){ //stampa a schermo tutte le info sulla flotta e i piloti
        for(Aereo a : flotta){ //ciclo sugli elementi di flotta
            System.out.println("Aereo modello: "+ a.getModello()+ "Numero posti: "+ a.getNumeroPosti()+" codice id: "+a.getCodice());//stampa info aereo a

        }
        for (Pilota p : piloti){ //ciclo sugli elementi di piloti
            System.out.println("Pilota nome: "+p.getNome()+ "numero brevetto: "+ p.getNumeroBrevetto()+"ore di volo: "+p.getOreVolo());//stampa info pilota p
        }
    }

}






