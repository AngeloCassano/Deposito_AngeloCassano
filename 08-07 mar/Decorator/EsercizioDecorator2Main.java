package Decorator;

public class EsercizioDecorator2Main {
    public static void main(String[] args) {
        Ordinazioni ordini  = Ordinazioni.getInstance();
        BaseBurger burger1 = new BaseBurger();
        BaseBurger burger2 = new BaseBurger();
        FormaggioDecorator formaggioBurger = new FormaggioDecorator(burger1);
        BaconDecorator formaggiobaconburger = new BaconDecorator(formaggioBurger);
        FormaggioDecorator formaggioburger2 = new FormaggioDecorator(burger2);
        ordini.notificaOrdine(formaggiobaconburger);
        ordini.notificaOrdine(formaggioburger2);
        ordini.stampaOrdini();
    }
}
