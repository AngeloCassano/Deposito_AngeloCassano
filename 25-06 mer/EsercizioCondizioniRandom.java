public class EsercizioCondizioniRandom {
     public static void main(String[] args) {
        
        boolean ammesso = true;
        //valore booleano assunto true

        int randometa = (int) (Math.random()*101);
        System.out.println("età random: "+ randometa);
        //genero random il valore dell'età
        if(randometa<=0){ // controllo età
            System.out.println("valore dell'età non consentito"); //messaggio valore non consentito
            return;
        }
        if ((randometa>=18) && (randometa<=40)){
            int randomtempo = (int) (Math.random()*101);
            System.out.println("tempo random nei 100 metri: "+randomtempo);
            //genero random il  miglior tempo
            if (randomtempo<=0){ //controllo valore del tempo
                System.out.println("Valore di Tempo non consentito"); //messaggio valore n3on consentito
                return;
            }
            if(Math.min(randomtempo, 12)==randomtempo){
                int randomaltezza = (int) (Math.random()*101);
                System.out.println("altezza random generata: "+randomaltezza);
                //genero valore random dell'altezza
                if (randomaltezza<=0){ //controllo valore dell'altezza
                System.out.println("Valore dell'altezza non consentito"); //messaggio valore non consentito
                return;
                }
                int randompeso = (int) (Math.random()*101);
                System.out.println("peso random generata: "+randompeso);
                //genero valore random del peso
                if (randompeso<=0){ //controllo valore del peso 
                    System.out.println("Valore del peso non consentito"); //messaggio valore non consentito
                    return;
                }
                double bmi = randompeso / Math.pow(randomaltezza, 2);
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
