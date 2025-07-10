import java.nio.channels.AcceptPendingException;

public class EsercizioStrategy2 {
    
}

//interfaccia MetodoPagamento(strategy)
interface MetodoPagamento{
    void paga(double importo);
}

class CartaDiCredito implements MetodoPagamento{// classe CartaDiCredito (strategia concreta)

    @Override
    public void paga(double importo) {//override del metodo dell'interfaccia
        System.out.println("Pagamento di :"+ importo+" effettuato con carta di credito");
    }
    
}

class PayPal implements MetodoPagamento{ // classe Paypal (strategia concreta)

    @Override
    public void paga(double importo) {//override del metodo dell'interfaccia
       System.out.println("Pagamento di :"+ importo+" effettuato con PayPal");
    }
    
}

class PagamentoContext { //classe pagamaneto context (context)
    private MetodoPagamento metodoPagamento;
    
    public void setMetodoPagamento(MetodoPagamento metodoPagamento){ //costruttore di metodoPagamento
        this.metodoPagamento = metodoPagamento;
    }

    public void eseguiPagamento(double importo){ //richiama paga di metodoPagamento per pagare l'importo passato come parametro
        metodoPagamento.paga(importo);
    }
}

class Acquisto {
    private static Acquisto instance;  
    // Istanza privata statica della classe 

    private PagamentoContext metodoPagamento; //variabile che contiene un'istanza di PagamentoContext
  

    // Costruttore privato per impedire l'istanziazione diretta
    private Acquisto() {}
  
    // Metodo pubblico statico per ottenere l'unica istanza della classe
    public static Acquisto getInstance() 
    {
        // Se l'istanza non esiste, viene creata
        if (instance == null) 
        {
         instance = new Acquisto();
        }
        // Restituisce l'istanza esistente o appena creata
        return instance;
    }

    public void setMetodoPagamento(PagamentoContext metodoPagamento){ //assegno il metodoPagamento
        this.metodoPagamento = metodoPagamento;
    }

    public void effettuaPagamento(double importo ){// metodo che richiama esegui pagamento
        metodoPagamento.eseguiPagamento(importo);
    }

}