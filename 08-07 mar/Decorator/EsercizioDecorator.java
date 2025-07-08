package Decorator;

public class EsercizioDecorator {
    
}

interface Messaggio { //interfaccia messaggio(component)
    public String getContenuto(); // metodo dell'interfaccia da implementare
}

class MessaggioBase implements Messaggio{ // componente concreto MessaggioBase implementa messaggio
    public String getContenuto(){ // metodo dell'interfaccia con comportamento di base
        return "esempio di messaggio base";
    }
}

abstract class DecoratoreMessaggio implements Messaggio { //decorator astratto decoratore messaggio
    protected Messaggio messaggio;

    public DecoratoreMessaggio(Messaggio messaggio) { //costruttore della classe
        this.messaggio = messaggio;
    }

    public String getCOntenuto(){ //metodo dell'interfaccia Messaggio implementato
        return messaggio.getContenuto();
    }
}
class DecoratoreMaiuscolo extends DecoratoreMessaggio{//decorator concreto decoratore maiuscolo
    DecoratoreMaiuscolo(Messaggio messaggio){ //costruttore di decoratormaiuscolo che richiama il costruttore della classe astratta
        super(messaggio);
    }

    public String getContenuto(){ //get contenuto con l'estensione del messaggio stampato in maiuscolo
        return messaggio.getContenuto().toUpperCase(); 
    }
}