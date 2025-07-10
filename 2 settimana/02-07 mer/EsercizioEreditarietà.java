import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioEreditarietà {
    public static void main(String[] args) {
        ArrayList<Animale> animali = new ArrayList<>(); // creo un arraylist di animali
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);
        //creo i  due scanner per Str e num

    int risposta; //creo risposta
    do {
        int risposta2; //dichiaro risposta2
        do{
           System.out.println("aggiungiamo un cane: inserisci il nome");
           String nome = scannerStr.nextLine();//prendo il nome del cane
           System.out.println("aggiungiamo un cane: inserisci l'età");
           int eta = scannerNum.nextInt();//prendo lìetà del cane
           animali.add(new Cane(nome, eta)); //aggiungo il cane alla lista
            System.out.println("Vuoi inserire un altro cane? si=1, no=2");
            risposta2 = scannerNum.nextInt(); //chiedo se vuole aggiungere un altro cane e prendo la risposta
        }while(risposta2!=2);
        do{
           System.out.println("aggiungiamo un gatto: inserisci il nome");
           String nome = scannerStr.nextLine();//prendo il nome del gatto
           System.out.println("aggiungiamo un gatto: inserisci l'età");
           int eta = scannerNum.nextInt();//prendo l'età del gatto
           animali.add(new Gatto(nome, eta));//aggiungo il gatto alla lista
            System.out.println("Vuoi inserire un altro gatto? si=1, no=2");
            risposta2 = scannerNum.nextInt(); //chiedo se vuole aggiungere un altro gatto e prendo la risposta
        }while(risposta2!=2);
        System.out.println("Vuoi inserire altri animali? 1=si, 2=no"); //stmapa messaggio di continua
        risposta = scannerNum.nextInt(); //input dallo scanner della risposta
    }while (risposta!=2);
    for(Animale a : animali){ //ciclo sugli elementi della lista
        System.out.println("Nome: "+ a.nome + "eta "+ a.eta + "Verso "); //stampo il nome e l'età
        a.faiVerso(); //richiamo faiverso che stampa il verso
    }
    }
   
}


class Vehicle{
    protected String brand = "Ford"; //attributo protected
    public void honk(){//metodo honk 
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle{
    private String modelName ="Fiat"; // attributo privato modelName di vehicle
    static void doSomething(){
        Car myCar = new Car(); // creo un oggetto car
        myCar.honk(); //richiamo il metodo della superclasse vehicle
        System.out.println(myCar.brand+ " "+ myCar.modelName);
     }
}

class Animale { //creo la classe animale
    String nome; 
    int eta;
    //attributi di classe

    void faiVerso(){ //stampa un verso generico
        System.out.println("Verso generico..."); // stampa del verso 
    }
}

class Cane extends Animale{ //creo la classe cane che estende animale
    Cane(String nome, int eta){ //costruttore di cane
        this.nome = nome; //assegno il nome
        this.eta = eta; //assegno l'eta
    }
    void faiVerso(){//override del metodo faiverso di Animale
        System.out.println("Bau!"); //stampa il verso del cane
    }
}

class Gatto extends Animale{ //creo la classe gatto che estende animale
    Gatto(String nome, int eta){ //costruttore di gatto
        this.nome = nome; //assegno il nome
        this.eta = eta; //assegno l'eta
    }
    void faiVerso(){//override del metodo faiverso di Animale
        System.out.println("Miao!"); //stampa il verso del gatto
    }
}

class Zoo { //classe che modella uno zoo
    ArrayList<Animale> settore1 = new ArrayList<>(); //arraylist degli animali nel settore 1
    ArrayList<Animale> settore2 = new ArrayList<>(); //arraylist degli animali nel settore 2
    ArrayList<Animale> settore3 = new ArrayList<>();  //arraylist degli animali nel settore 3

    void addSettore1(Animale a){ //aggiunge l'animale a al settore 1
        this.settore1.add(a); //aggiunge a alla lista
    }

     void addSettore2(Animale a){ //aggiunge l'animale a al settore 2
        this.settore2.add(a); // aggiunge a alla lista
    }
    
     void addSettore3(Animale a){ //aggiunge l'animale a al settore 2
        this.settore3.add(a); // aggiunge a alla lista
    }
}