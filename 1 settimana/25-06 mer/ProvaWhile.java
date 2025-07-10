import java.util.Scanner;

public class ProvaWhile {
    public static void main(String[] args) {
        int i=1;
        //inizializzazione variabile di controllo
        while(i<=5) {
            i++; //incremento della variabile di controllo
            System.out.println(i);
        }
    
    Scanner input = new Scanner(System.in);
    int numero;

    do{
        System.out.println("Inserisci un numero (0 per uscire): ");
        numero = input.nextInt();

    }while (numero!=0);

    System.out.println("Hai inserito 0. Programma terminato.");

    }
}


