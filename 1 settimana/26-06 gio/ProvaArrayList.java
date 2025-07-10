import java.util.ArrayList;
import java.util.Collections;
public class ProvaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>(); //creo un arraylist
        numeri.add(10);
        numeri.add(20);
        numeri.add(30);
        //aggiungo valori all'arraylist

        ArrayList<String> nomi = new ArrayList<>(); //arraylist di stringhe
        nomi.add("Alice");
        nomi.add("Bob");
        nomi.add("Carlo");
        //inserisco dei valori in nomi
        System.out.println("Primo nome: " + nomi.get(0)); //stampo il primo elemento


        ArrayList<Integer> numeri2 = new ArrayList<>();
        //creo l'arraylist
        //aggiunta di 10 numeri casuali
        for(int i=0; i<10; i++){
            numeri2.add((int) (Math.random() *100)+1);
        }

        //stampa della lista originale
        System.out.println("Lista originale: " + numeri2);

        //ordinamento della lista
        Collections.sort(numeri2);

        //stampa della lista ordinata
        System.out.println("Lista ordinata; " + numeri2);

        int massimolista = Collections.max(numeri2); //restituisco il numero massimo
        System.out.println("Il numero più grande dell'arraylist è: " + massimolista); //stampo il massimo

        

    }
}
