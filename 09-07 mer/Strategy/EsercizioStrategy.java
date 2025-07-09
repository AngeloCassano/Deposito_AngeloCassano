public class EsercizioStrategy {
    
}

//interfaccia Operazione(strategy)
interface Operazione{
    int esegui(int a, int b);
}

class Addizione implements Operazione{// classe Addizione (strategia concreta)

    @Override
    public int esegui(int a, int b) {//override del metodo dell'interfaccia
        return a+b;
    }
    
}

class Moltiplicazione implements Operazione{// classe Moltiplicazione (strategia concreta)

    @Override
    public int esegui(int a, int b) {//override del metodo dell'interfaccia
        return a*b;
    }
    
}

class Calcolatore { //classe calcolatore (context)
    private Operazione operazione;
    
    public void setOperazione(Operazione operazione){
        this.operazione = operazione;
    }

    public int eseguiOperazione(int a, int b){
       return operazione.esegui(a, b);
    }
}