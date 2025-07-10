public class EsercizioAdapter {
    public static void main(String[] args) {
        EuropeanSocket dispositivoEuropeo = new EuropeanDevice(); // creo un dispotiviso europeo
        SocketAdapter adattatoreAmericano = new SocketAdapter(dispositivoEuropeo); //passo il dispositivo europeo nell'adattatore americano
        adattatoreAmericano.provideElectricity();//richiamo il metodo che dà la corrente
    }
}

interface EuropeanSocket{ //interfaccia presa europea
    void giveElectricity(); //metodo giveelectricity specifico della presa europea
}

interface AmericanSocket{ //interfaccia presa americana
    void provideElectricity(); //metodo provideelectricity specifico della presa americana
}

class SocketAdapter implements AmericanSocket{// adattatore della presa europea in quella americana
    private EuropeanSocket adaptee; //elemento adattato (presa europea)

    SocketAdapter (EuropeanSocket eusocket){ //costruttore di SocketAdapter
        this.adaptee = eusocket; 
    }

    @Override
    public void provideElectricity() { //metodo che adatta quello della presa europea per farla funzionare in quella americana
        adaptee.giveElectricity();
    }

}

class EuropeanDevice implements EuropeanSocket{ //classe dispotivo europeo che implementa l'interfaccia EuropeanSocket

    @Override
    public void giveElectricity() { //utilizzo il metodo di EuropeanSOcket con dentro il richiamo a quello di AmericanSocket
        System.out.println("Corrente data ad un dispositivo europeo");
    }
};

