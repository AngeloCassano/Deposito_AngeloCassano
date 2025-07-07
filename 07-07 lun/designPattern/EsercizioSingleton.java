package designPattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EsercizioSingleton {
    public static void main(String[] args) {
        Logger2 logBianchi = Logger2.getInstanza(); //prendo l'istanza di logger2 per i pezzi bianchi della scacchiera
        logBianchi.ScriviMessaggio("Posizionati i pedoni bianchi sulla scacchiera");
        logBianchi.ScriviMessaggio("Posizionate le torri bianche sulla scacchiera");
        logBianchi.ScriviMessaggio("Posizionati gli alfieri bianchi sulla scacchiera");
        logBianchi.ScriviMessaggio("Posizionati i cavalli bianchi sulla scacchiera");
        logBianchi.ScriviMessaggio("Posizionata la regina bianca sulla scacchiera");
        logBianchi.ScriviMessaggio("Posizionato il re bianco sulla scacchiera");
        //messaggi di posizionamento dei pezzi bianchi
        Logger2 logNeri = Logger2.getInstanza(); //richiamo getIstanza per un log per i pezzi neri della scacchiera
        logNeri.ScriviMessaggio("Posizionati i pedoni neri sulla scacchiera");
        logNeri.ScriviMessaggio("Posizionate le torri nere sulla scacchiera");
        logNeri.ScriviMessaggio("Posizionati gli alfieri neri sulla scacchiera");
        logNeri.ScriviMessaggio("Posizionati i cavalli neri sulla scacchiera");
        logNeri.ScriviMessaggio("Posizionata la regina nera sulla scacchiera");
        logNeri.ScriviMessaggio("Posizionato il re nero sulla scacchiera");
        //messaggi di posizionamento dei pezzi neri
        if (logBianchi.equals(logNeri)){ // se logbianchi e logNeri hanno lo stesso riferimento
            System.out.println("LogBianchi e logNeri sono la stessa istanza"); //stampa il messaggio
        }



    }
}

class Logger2 {
    private static Logger2 instance; //attributo dell'unica istanza di Logger

    private Logger2(){}; //costruttore privato non richiamabile all'esterno di Logger

    public static Logger2 getInstanza(){
        if(instance==null){ //se l'istanza non esiste viene creata
            instance = new Logger2();
        }
        return instance; //restituisco l'istanza
    }
   
    public void ScriviMessaggio(String messaggio){ //metodo che stampa una stringa messaggio assieme all'ora corrente al momento della stampa
        String dataOra = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[" + dataOra + "] " + messaggio);
    }
    
}