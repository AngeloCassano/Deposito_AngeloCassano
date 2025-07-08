package observer;

import java.util.ArrayList;
import java.util.List;

public class EsercizioObserverSingleton {
    
}

// Interfaccia investitore
interface Investitore {
    void aggiornaValoreAzione(String azione, Double valore);
}

// Interfaccia SubjectBorsa
interface SubjectBorsa {
    void aggiungiInvestitore(Investitore i);
    void rimuoviInvestitore(Investitore i);
    void notificaInvestitori();
}

// classe agenziaborsa che implementa l'interfaccia subjectborsa
class AgenziaBorsa implements SubjectBorsa {
    private List<Investitore> listaInvestitori = new ArrayList<>(); // lista degli investitori nell'agenzia di borsa
    private String nomeAzione; //nome dell'azione
    
    private Double valoreAzione; // valore dell'azione
     
    // Istanza privata statica della classe AgenziaBorsa
    private static AgenziaBorsa instance;

    // Costruttore privato per impedire l'istanziazione diretta
    private AgenziaBorsa() {}
  
    // Metodo pubblico statico per ottenere l'unica istanza della classe
    public static AgenziaBorsa getInstance() 
    { 
        // Se l'istanza non esiste, viene creata
        if (instance == null) 
        {
        instance = new AgenziaBorsa();
        }
        // Restituisce l'istanza esistente o appena creata
        return instance;
    }


    public String getNomeAzione() { //metodo get del nome dell'azione
        return nomeAzione;
    }

    public void setNomeAzione(String nomeAzione) { //metodo set del nome dell'azione
        this.nomeAzione = nomeAzione;
    }

    public void setValoreAzione(Double valore) { //metodo set del valore dell'azione con notifica agli investitori
        this.valoreAzione = valore;
        notificaInvestitori();
    }

    public void aggiungiInvestitore(Investitore i) { //aggiungo un investitore alla lista
        listaInvestitori.add(i);
    }

    public void rimuoviInvestitore(Investitore i) { //rimuovo un investitore dalla lista
        listaInvestitori.remove(i);
    }

    public void notificaInvestitori() { // notifico agli investitori nella lista il cambiamento del valore dell'azione
        for (Investitore i : listaInvestitori) {
            i.aggiornaValoreAzione(nomeAzione, valoreAzione);
        }
    }
}

class InvestitorePrivato implements Investitore{
    private String nome; //nome dell'investitore privato

    public InvestitorePrivato(String nome) { //costruttore dell'investitore privato
        this.nome = nome;
    }
    @Override
    public void aggiornaValoreAzione(String nome, Double valore){ //aggiornamento del valore dell'azione
        System.out.println("Il nuovo valore dell'azione: " +nome + "  è: " + valore);
    }
    
}

class InvestitoreBancario implements Investitore{
    private String nome; //nome dell'investitore bacario

    public InvestitoreBancario(String nome) { //costruttore dell'investitore bancario
        this.nome = nome;
    }
    @Override
    public void aggiornaValoreAzione(String nome, Double valore){  //aggiornamento del valore dell'azione
       System.out.println("Il nuovo valore dell'azione: " +nome + "  è: " + valore);
    }
    
}
