public class EsempioClassi {
    public static void main(String[] args) {
        Auto miAuto = new Auto();//creazione oggetto
        miAuto.marca = "Tesla"; //assegnazione valori
        miAuto.anno= 2023;
        miAuto.prezzo = 59999.99;
        miAuto.mostraInfo(); // Output. Tesla - 2023 - €59999.99

        Studente studente1 = new Studente("Alessandro");
        Studente studente2 = new Studente("Francesco");
        System.out.println("Il numero di studenti è: "+Studente.totaleStudenti);
    }
}

class Auto {
    String marca;
    int anno;
    double prezzo;

    void mostraInfo(){
        System.out.println(marca+ " - "+ anno + " - €" + prezzo);
    }
}

class Studente{
    String nome; //variabile di istanza
    static int totaleStudenti = 0; //variabile statica
    static int stampaContatore(){
        return totaleStudenti;
    }
    Studente(String nome){
        this.nome = nome;
        totaleStudenti++; //incremento per ogni nuovo oggetto
    }
}

