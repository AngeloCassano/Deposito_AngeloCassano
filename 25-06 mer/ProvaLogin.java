import java.util.Scanner;

public class ProvaLogin {
    public static void main(String[] args) {
        final String password = "java123";
        //costante della passord per accedere
        String provapassword, risposta;
        //creo la variabile della password in input
        Scanner myScanner = new Scanner(System.in);
        //creo lo scanner per la password in input
        boolean corretta = false;
        int i= 0; // creo il contatore inizializzato a 0
        while (i<3){
            System.out.println("Inserisci la password");
            //chiedo la password
            provapassword = myScanner.nextLine();
            //prendo in inpiut la password
            if(password.equals(provapassword)){ //verifico la password inserita
                corretta= true; // cambio a true
                break; //termino il ciclo
            }
            i++;    // incremento contatore
            System.out.println("Tentativi rimasti: "+ (3-i)); //stampo i tentativi rimasti
        }
        if (corretta){ //se la password è corretta
                do{ //cicla
                    System.out.println("Vuoi accedere al sistema? (s/n)"); //chiedo l'accesso
                    risposta = myScanner.nextLine(); //input della risposta
                }while (!(risposta.equals("s")) && !(risposta.equals("n"))); //ciclo finchè non ha inserito 's' o 'n'
                if (risposta.equals("s")){ // se ha risposto con s
                    System.out.println("Accesso al sistema effettuato"); //output risposta
                } else if (risposta.equals("n")){ // se ha risposto n
                    System.out.println("Accesso annulato"); // messaggio accesso annulato
                }
        } else{
            System.out.println("Accesso bloccato"); //messaggio password non corretta
        }
    }
}
