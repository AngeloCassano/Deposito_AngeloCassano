import java.util.ArrayList;

public class EsercizioFacade2 {
    
}

interface ComponentePc{ //interfaccia componente pc
    public void inizializza();
    public void carica();
    public void avvia();
}


    class Bios implements ComponentePc{ //classe bios che implementa i metodi dell'interfaccia Componente pc
        @Override
        public void inizializza(){
            System.out.println("Inizializzato il Bios");
        }

        @Override
        public void carica() {
            System.out.println("Caricamento del Bios");
        }

        @Override
        public void avvia() {
            System.out.println("Avvio del Bios");
        }
    }

    class HardDisk implements ComponentePc{ //classe harddick che implementa i metodi dell'interfaccia componente pc

        @Override
        public void inizializza(){
            System.out.println("Inizializzato l'HardDisk");
        }

        @Override
        public void carica() {
            System.out.println("Caricamento dell'HardDisk");
        }

        @Override
        public void avvia() {
            System.out.println("Avvio dell'HardDisk");
        }
    }

    class SistemaOperativo implements ComponentePc{ //classe sistemaoperativo che implementa i metodi dell'interfaccia componente pc

        @Override
        public void inizializza(){
            System.out.println("Inizializzato il sistema operativo");
        }

        @Override
        public void carica() {
            System.out.println("Caricamento del sistema operativo");
        }

        @Override
        public void avvia() {
            System.out.println("Avvio del sistema operativo");
        }
    }

    class ComputerFacade { // facade per accendere i componenti di un pc 
    private Bios bios;
    private HardDisk hardidisk;
    private SistemaOperativo os;
    //attributi che contengono i sottosistemi(componenti del pc) gestiti da computerfacade

    ComputerFacade(Bios bios, HardDisk hd, SistemaOperativo os){//costruttore che prende in input i riferimenti dei componenti
        this.bios = bios;
        this.hardidisk = hd;
        this.os = os;
    }

    public void accendiComputer() { //richiama i metodi necessari a mettere in funzione i componenti del pc
        bios.avvia();
        bios.carica();
        bios.inizializza();
        hardidisk.avvia();
        hardidisk.carica();
        hardidisk.inizializza();
        os.avvia();
        os.carica();
        os.inizializza();
    }
}

class RetediPc{ //classe subject
    private boolean accesi;
    // variabile di stato che indica se i pc nella rete sono accesi

    ArrayList<ComputerFacade> retedipc =new ArrayList<ComputerFacade>();
    //lista dei pc nella rete

    void addRete(ComputerFacade pc){// aggiungo un pc alla rete
        retedipc.add(pc);
    }


    void removeRete(ComputerFacade pc){ //rimuovo un pc dalla rete
        retedipc.remove(pc);
    }

    private void accendiPc(){ //accendo i pc nella lista della rete
        for(ComputerFacade computerFacade : retedipc){
            computerFacade.accendiComputer();
        }
    }


    void setPcOn(boolean accendi){ // cambio lo stato dei pc della rete 
        if(accendi){
            this.accendiPc();
            this.accesi = true;
        }
    }

}





    
