package observer;

import java.util.Scanner;

public class EsercizioObserverSingletonMain {
    public static void main(String[] args) {
        AgenziaBorsa agenziaBorsa = AgenziaBorsa.getInstance();
        /*agenziaBorsa.aggiungiInvestitore(new InvestitorePrivato("alfonso"));
        agenziaBorsa.aggiungiInvestitore(new InvestitoreBancario("mario"));
        agenziaBorsa.setNomeAzione("nasdaq");
        agenziaBorsa.setValoreAzione(44.44d); */

    try(Scanner scannerNum = new Scanner(System.in); Scanner scannerStr = new Scanner(System.in)){// creato gli scanner all'interno di un try with resources
        int codice; //valore del comando selezionato
        String continua = new String(); // stringa per continuare
        
        do {
            System.out.println("Inserisci il codice per l'operazione desiderata:");
            System.out.println("1 aggiungi investitore privato"); 
            System.out.println("2  agiungi investitore bancario");
            System.out.println("3  cambia il valore dell'azione");
            //stampa menu
            codice = scannerNum.nextInt(); //input del codice selezionato
            switch (codice) {
                case 1://aggiungi investitore privato
                    System.out.println("Inserisci il nome dell'investitore privato da inserire");
                    agenziaBorsa.aggiungiInvestitore(new InvestitorePrivato(scannerStr.nextLine()));
                    break;
            
                case 2://agiungi investitore bancario
                    System.out.println("Inserisci il nome dell'investitore bancario da inserire");
                    agenziaBorsa.aggiungiInvestitore(new InvestitoreBancario(scannerStr.nextLine()));
                    break;

                case 3://cambia il valore dell'azione
                    System.out.println("Inserisci il nome dell'azione");
                    agenziaBorsa.setNomeAzione(scannerStr.nextLine());
                    System.out.println("Inserisci il nuovo valore dell'azione");
                    agenziaBorsa.setValoreAzione(scannerNum.nextDouble());
                    break;
                    
                default:
                    System.out.println("Codice dell'operazione errato"); //stampa codice non presente
                    break;
            }

            System.out.println("vuoi continuare? (si/no)"); //chiedo se vuole continuare
            continua = scannerStr.nextLine(); //input della risposta
        }while (!continua.equals("no")); //ciclo finchè continua è diverso da no
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    
    
	


    }
}
