import java.util.Scanner;

public class ProvaFactoryMethod2 {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        System.out.println("Che tipo di veicolo vuoi creare");
        IVeicolo iveicolo;
        String tipo = scannerStr.nextLine();
        iveicolo = VeicoloFactory.CreaVeicolo(tipo);
        iveicolo.Avvia();
        iveicolo.MostraTipo();
        


    }
}

// IVeicolo: definisce l'interfaccia del prodotto
interface IVeicolo {
    void Avvia();
    void MostraTipo();

}

// Auto: implementa Iveicolo
class Auto3 implements IVeicolo {
    @Override
    public void Avvia() {
        System.out.println("Avvio dell'auto");
    }
    public void MostraTipo(){
        System.out.println("Tipo: Auto");
    }


}

// Moto: implementa Iveicolo
class Moto implements IVeicolo {
    @Override
    public void Avvia() {
        System.out.println("Avvio della Moto");
    }
    public void MostraTipo(){
        System.out.println("Tipo: Moto");
    }
}

// Camion: implementa Iveicolo
class Camion implements IVeicolo {
    @Override
    public void Avvia() {
        System.out.println("Avvio del Camion");
    }
    public void MostraTipo(){
        System.out.println("Tipo: Camion");
    }
}

// 
class VeicoloFactory {
    
    static IVeicolo CreaVeicolo(String tipo){
        
        if(tipo.equalsIgnoreCase("auto")){
            return new Auto3();
        }else if(tipo.equalsIgnoreCase("moto")){
            return new Moto();
        }else if (tipo.equalsIgnoreCase("camion")) {
            return new Camion();
        }else{
            System.out.println("tipo non accettato");
            return null;
        }

    }

}


