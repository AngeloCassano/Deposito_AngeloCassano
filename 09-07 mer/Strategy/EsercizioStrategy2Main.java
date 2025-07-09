import java.util.Scanner;

public class EsercizioStrategy2Main {
    public static void main(String[] args) {
        
        Acquisto acquisto = null;
        try(Scanner scannerNum = new Scanner(System.in); Scanner scannerStr = new Scanner(System.in)){// creato gli scanner all'interno di un try with resources
        int codice; //valore del comando selezionato
        String continua = new String(); // stringa per continuare
        
        do {
            System.out.println("Inserisci il codice per l'operazione desiderata:");
            System.out.println("1  Avvia un acquisto"); 
            System.out.println("2  Scegli il metodo di pagamento");
            System.out.println("3  Inserisci l'importo ed effettua il pagamento");
            //stampa menu
            codice = scannerNum.nextInt(); //input del codice selezionato
            switch (codice) {
                case 1:// 
                    acquisto = Acquisto.getInstance();
                    System.out.println("Avviato un acquisto");
                    break;
            
                case 2:// Scegli il metodo di pagamento
                    System.out.println("Inserisci il tipo di pagamaneto desiderato (1:Carta di credito/2:paypal)");  
                    int scelta = scannerNum.nextInt();
                    switch (scelta) {
                        case 1:
                            PagamentoContext pagamentocarta = new PagamentoContext();
                            pagamentocarta.setMetodoPagamento(new CartaDiCredito());
                            acquisto.setMetodoPagamento(pagamentocarta);
                            break;

                        case 2:
                            PagamentoContext pagamentopaypal = new PagamentoContext();
                            pagamentopaypal.setMetodoPagamento(new PayPal());
                            acquisto.setMetodoPagamento(pagamentopaypal);
                            break;
                    
                        default:
                        System.out.println("Codice dell'operazione errato"); //stampa codice non presente
                            break;
                    }

                    break;

                case 3:// Inserisci l'importo ed effettua il pagamento
                    
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
