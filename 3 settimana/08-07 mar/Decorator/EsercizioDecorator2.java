package Decorator;

import java.util.ArrayList;

public class EsercizioDecorator2 {
    
}

interface Hamburger { //interfaccia (component) hamburger
    public String getDescrizione();
    public Double getPrezzo();
    //metodi dell'interfaccia component
}

class BaseBurger implements Hamburger{ //classe baseburger component concreto


    @Override
    public String getDescrizione() { //implementazione del metodo getDescrizione dell'interfaccia component
        return "Hamburger";
    }

    @Override
    public Double getPrezzo() {//implementazione del metodo getPrezzo dell'interfaccia component
       return 6.00d;
    }
    
}

abstract class DecoratorBurger implements Hamburger{ //classe astratta decoratorBurger implementa l'interfaccia Hamburger
    protected Hamburger hamburger; //riferimento ad un oggetto Hamburger

    DecoratorBurger(Hamburger hamburger){ //costruttore della classe astratta
        this.hamburger = hamburger;
    }

    public String getDescrizione() { //metodo getDescrizione dell'interfaccia implementato
        return hamburger.getDescrizione();
    }

   
    public Double getPrezzo() { //metodo getPrezzo dell'interfaccia implementato
       return hamburger.getPrezzo();
    }
}

class FormaggioDecorator extends DecoratorBurger{ //classe FormaggioDecorator che realizza la classe astratta DecoratorBurger

    FormaggioDecorator(Hamburger burger){ //costruttore di FormaggioDecorator che richiama il costruttore della classe astratta da cui eredita
        super(burger);
    }

    public String getDescrizione() { //metodo getDescrizione dell'interfaccia Hamburger con l'estensione della descrizione 
        return hamburger.getDescrizione()+ " + Formaggio ";
    }

   
    public Double getPrezzo() { //metodo getPrezzo dell'interfaccia Hamburger con l'estensione del prezzo
       return hamburger.getPrezzo()+0.50d;
    }
}

class BaconDecorator extends DecoratorBurger{ //classe BaconDecorator che realizza la classe astratta DecoratorBurger

    BaconDecorator(Hamburger burger){//costruttore di BaconDecorator che richiama il costruttore della classe astratta da cui eredita
        super(burger);
    }

    public String getDescrizione() { //metodo getDescrizione dell'interfaccia Hamburger con l'estensione della descrizione
        return hamburger.getDescrizione()+ " + Bacon ";
    }

   
    public Double getPrezzo() { //metodo getPrezzo dell'interfaccia Hamburger con l'estensione del prezzo
       return hamburger.getPrezzo()+0.80d; 
    }
}


interface OsservatoreOrdine { //interfaccia observer
    void notificaOrdine(Hamburger h);
}


class Ordinazioni implements OsservatoreOrdine { //classe ordinazioni singleton
    private ArrayList<Hamburger> ordini; //lista degli ordini di hamburger
    private static Ordinazioni instance; //attributo con l'istanza di ordinazioni

    private Ordinazioni() { //costruttore privato di ordinazioni
        ordini = new ArrayList<>();
    }

    public static Ordinazioni getInstance()  //get instance per restituire il riferimento all'istanza di ordinazioni
    {
    
        if (instance == null) 
        {
        instance = new Ordinazioni();
        }
    
        return instance;
  }

    @Override
    public void notificaOrdine(Hamburger h) { //metodo che aggiunge l'hamburger dell'ordinazione
        ordini.add(h);
        System.out.println("Ordinazione: Panino - "+ h.getDescrizione()+ " prezzo: "+h.getPrezzo());

    }

    public void stampaOrdini(){ //metodo che stampa le descrizioni dei panini nella lista degli ordini
        System.out.println("Questi sono i panini ordinati");
        for (Hamburger h : ordini){
            System.out.println("panino: "+h.getDescrizione()+ "prezzo:" + h.getPrezzo());
        }
    }


}

