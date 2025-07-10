import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        //creo l'oggetto Scanner per leggere una stringa
        Scanner myScanner = new Scanner(System.in);

        //Leggo una stringa e la stampo a schermo
        System.out.println("Inserisci stringa");
        String stringa = myScanner.nextLine();
        System.out.println("La stringa che hai inserito è: "+stringa);
        
        //creo un secondo oggetto Scanner per i numeri
        Scanner myScanner2 = new Scanner(System.in);

        //leggo un booleano dallo scanner e lo stampo
        System.out.println("Inserisci un booleano");
        boolean booleano = myScanner2.nextBoolean();
        System.out.println("Il booleano che hai inserito è: "+ booleano);
        
        //leggo un intero dallo scanner e lo stampo
        System.out.println("Inserisci un intero");
        int numero = myScanner2.nextInt();
        System.out.println("Il numero che hai inserito è: "+ numero);

        //leggo un double dallo scanner e lo stampo
        System.out.println("Inserisci un double");
        double numerodouble = myScanner2.nextDouble();
        System.out.println("Il double che hai inserito è: "+ numerodouble);

        //leggo un float dallo scanner e lo stampo
        System.out.println("Inserisci un numero float");
        float numerofloat = myScanner2.nextFloat();
        System.out.println("Il numero float che hai inserito è:"+ numerofloat);

        //converto un int in un double e lo stampo
        double inttodouble = numero;
        System.out.println("Il valore dell'intero convertito a double è: "+ inttodouble);
        
        //converto un double in int e lo stampo
        int doubletoint = (int) numerodouble;
        System.out.println("Il valore del double convertito ad int è: "+ doubletoint);


    }
}
