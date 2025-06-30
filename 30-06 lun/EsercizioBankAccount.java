import java.util.Random;
import java.util.Scanner;

public class EsercizioBankAccount {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in); //creazione scanner per le stringhe
        Scanner scannerNum = new Scanner(System.in); //creazione scanner per i numeri
        String risposta = new String(); //creo la stringa risposta
        System.out.println("Inserisci il tuo nome"); //stampa messaggio
        String nome = scannerStr.nextLine(); //input del nome dell'holder
        BankAccount account1 = new BankAccount(nome);
        do{
            System.out.println("Inserisci l'operazione che vuoi effettuare: 1 per il deposito, 2 per il prelievo, 3 per la stampa del saldo");
            //stampa messaggio
            int scelta = scannerNum.nextInt(); //input scelta
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci la somma da depositare:"); //stampa messaggio
                    account1.deposit(scannerNum.nextInt()); //richiamo deposit
                    break;
                case 2:
                    System.out.println("Inserisci la somma da prelevare:"); //stampa messaggio
                    account1.withdraw(scannerNum.nextInt()); //richiamo withdraw
                    break;

                case 3:
                    account1.displayBalance(); //richiamo il metodo displaybalance per stampare il saldo
                    break;
                default:
                    System.out.println("Codice operazione non accettato"); //messaggio erroe
                    break;
            }


            System.out.println("Vuoi effettuare altre operazioni? (si/no)");
            risposta = scannerStr.nextLine(); //input stringa di risposta
        }while(!risposta.equals("no"));
        

    }

}

class BankAccount {

    String accountHolderName;
    double balance;
    //attributi della classe


    //costruttore
    BankAccount(String holderName){
        this.accountHolderName= holderName; //nome dell'acccount passato come parametro
        // Saldo iniziale random tra 0 e 1000
        this.balance = new Random().nextDouble() * 1000;
    }

    void deposit (double amount){
        this.balance+=amount;
    }
    //metodo deposita

    void withdraw(double amount){
        if ((balance-amount)<0){
            System.out.println("Prelievo non autorizzato. Saldo negativo non consentito");
        }else{
            balance-=amount;
        }
    }
    //metodo prelievo

    void displayBalance(){
        System.out.println("Il saldo attuale è: "+balance);
    }
    //stampa il saldo

}