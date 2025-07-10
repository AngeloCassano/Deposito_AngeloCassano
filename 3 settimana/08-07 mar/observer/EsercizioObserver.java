package observer;
import java.util.ArrayList;

public class EsercizioObserver {
    public static void main(String[] args) {
        
    }
}

// Interfaccia Display per gli observer
interface Display {
    void aggiorna(float temperatura);
}

// Interfaccia per un Subject che è osservato da display
interface Subject {
    void AggiungiDisplay(Display d);
    void rimuoviDisplay(Display d);
    void notificaDisplay();
}



class StazioneMeteo implements Subject { //classe subject stazione meteo
    private ArrayList<Display> listaDisplay = new ArrayList<>(); //lista dei display
    private float temperatura; //valore della temperatura (state)
    @Override
    public void AggiungiDisplay(Display d) { //aggiungo un display alla lista
        listaDisplay.add(d);
    }

    @Override
    public void rimuoviDisplay(Display d) { //rimuovo un display dalla lista
       listaDisplay.remove(d);
    }

    @Override
    public void notificaDisplay() { //notifica ai display il cambio di temperatura
        for (Display d : listaDisplay) {
            d.aggiorna(temperatura);

        }
    }

    void setTemperatura(float t){ //cambio il valore della temperatura e lo notifico ai display
        temperatura = t;
        notificaDisplay();
    }
    
}

class DisplayConsole implements Display{
    private String nome; //nome del display

    public DisplayConsole(String nome) { //costruttore del display
        this.nome = nome;
    }
    @Override
    public void aggiorna(float temperatura) { //aggiornamento dello stato della temperatura dalla stazione meteo
        System.out.println("Il display da console: " +nome + " ha ricevuto aggiornamento l'ultima temperatura registrata è: " + temperatura);
    }
    
}

class DisplayMobile implements Display{
    private String nome; //nome del display

    public DisplayMobile(String nome) { //costruttore del display
        this.nome = nome;
    }
    @Override
    public void aggiorna(float temperatura) { //aggiornamento dello stato della temperatura dalla stazione meteo
        System.out.println("Il display da mobile: " +nome + " ha ricevuto aggiornamento l'ultima temperatura registrata è: " + temperatura);
    }
    
}
