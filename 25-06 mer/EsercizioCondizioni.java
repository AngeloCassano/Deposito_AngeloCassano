import java.util.Scanner;

public class EsercizioCondizioni {
    public static void main(String[] args) {
        int eta, tempo, peso, altezza;
        //creo le variabili numeriche
        boolean ammesso = true;
        //valore booleano assunto true
        Scanner myScannerNum = new Scanner(System.in);
        //creo il mio scanner per i valori numerici

        System.out.println("Inserisci la tua età");
        eta = myScannerNum.nextInt();
        //input dell'età
        if(eta<=0){ // controllo età
            System.out.println("valore dell'età non consentito"); //messaggio valore non consentito
            return;
        }
        if ((eta>=18) && (eta<=40)){
            System.out.println("Inserisci il tuo tempo nei 100 metri");
            tempo = myScannerNum.nextInt();
            //input del miglior tempo
            if (tempo<=0){ //controllo valore del tempo
                System.out.println("Valore di Tempo non consentito"); //messaggio valore n3on consentito
                return;
            }
            if(Math.min(tempo, 12)==tempo){
                System.out.println("Inserisci la tua altezza");
                altezza = myScannerNum.nextInt();
                //input dell'altezza
                if (altezza<=0){ //controllo valore dell'altezza
                System.out.println("Valore dell'altezza non consentito"); //messaggio valore non consentito
                return;
                }
                System.out.println("Inserisci il tuo peso");
                peso = myScannerNum.nextInt();
                //input del peso
                if (peso<=0){ //controllo valore del peso 
                    System.out.println("Valore del peso non consentito"); //messaggio valore non consentito
                    return;
                }
                double bmi = peso / Math.pow(altezza, 2);
                if(bmi<25){
                    System.out.println("Ammesso alla gara");
                    //stampa messaggio di ammissione
                }else{
                    ammesso=false; 
                    //non ammesso
                }
            }else {
                ammesso = false; // condizione non superata

            }
        }else{
            ammesso = false; //condizione non superata
        }
        if (ammesso==false){
            System.out.println("Non ammesso alla gara");
            // messaggio di non ammissione
        }









    }
}
