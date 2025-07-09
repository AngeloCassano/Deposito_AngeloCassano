

public class EsercizioStrategymain {
    public static void main(String[] args) {
        Calcolatore calcolatore = new Calcolatore();
        calcolatore.setOperazione(new Addizione());
        System.out.println("Somma di 5 e 6 :"+calcolatore.eseguiOperazione(5, 6));
        calcolatore.setOperazione(new Moltiplicazione());
        System.out.println("Prodotto di 5 e 6 :"+calcolatore.eseguiOperazione(5, 6));
    }
    
    

}
