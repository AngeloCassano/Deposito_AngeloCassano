import java.util.ArrayList;

public class EsempioClassi3 {

    public static void main(String[] args) {
        Calcolatrice calc = new Calcolatrice(); // creo oggetto
        calc.saluta(); // invoco metodo saluta
        int risultato = calc.somma(5, 3); // metto in risultato la return di somma
        System.out.println("La somma è: " + risultato); // stampa
        ArrayList<Auto2> Auto2List = new ArrayList<>(); // creo un arraylist

        Auto2List.add(new Auto2("Tesla", 2023));

        Auto2List.add(new Auto2("Ford", 2020)); // aggiungo due oggetti Auto2

        for (Auto2 Auto2 : Auto2List) { // ciclo per gli oggetti dell'arrayList
            System.out.println(Auto2.marca + " - " + Auto2.anno); // stampo le info
        }
    }
}

class Calcolatrice {
    // metodo con ritorno
    int somma(int a, int b) {
        return a + b;
    }

    // metodo senza ritorno
    void saluta() {
        System.out.println("CIao!");
    }

}

class Auto2 {
    String marca;
    int anno;
    // parametri di Auto2

    // costruttore con parametri

    Auto2(String marca, int anno) {
        this.marca = marca;
        this.anno = anno;
    }
}