package Decorator;

public class EsercizioDecoratorMain {
    public static void main(String[] args) {
        MessaggioBase msgbase = new MessaggioBase();// creo un component concreto
        DecoratoreMaiuscolo messaggioMaiuscolo = new DecoratoreMaiuscolo(msgbase); // il compnent al decorator concreto
        System.out.println(msgbase.getContenuto()); // stampa della stringa del messaggio di base
        System.out.println(messaggioMaiuscolo.getContenuto()); // stampa della stringa in maiuscolo
    }
}
