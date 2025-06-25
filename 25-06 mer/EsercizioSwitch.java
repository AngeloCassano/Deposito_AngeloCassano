import java.util.Scanner;

public class EsercizioSwitch {
    public static void main(String[] args) {
        float prezzo = 500.00f;
        int eta, esperienza, incidenti;
        String pacchetto = new String();
        boolean idoneo = true; // assumo che sia idoneo
        //creo le variabili di cui ho bisogno
        Scanner myScannerNum = new Scanner(System.in);
        Scanner myScannerStr = new Scanner(System.in);
        //creo gli scanner per i numeri e per le stringhe
        System.out.println("Inserisci la tua eta");
        eta = myScannerNum.nextInt();
        //input dell'eta
        if(eta<18){ //verifico sia maggiorenne
            idoneo = false; // non è più idoneo
        }else if((eta>18) && (eta<25)){ //se l'età è compresa tra i due stremi
            prezzo *= 1.2; // applico la maggiorazione
        }else if (eta>50){
            prezzo *=0.9; // applico lo sconto
        }
        if(idoneo){ // se è ancora idoneo continuo
            System.out.println("Inserisci gli anni di esperienza alla guida");
            esperienza = myScannerNum.nextInt(); 
            //chiedo gli anni di esperienza alla guida
            if (esperienza<2){ //se gli anni di esperienza sono meno di 2
                prezzo *=1.3; //maggioraione del prezzo
            }
            System.out.println("Inserisci in numero di incidenti negli ultimi 5 anni");
            incidenti = myScannerNum.nextInt();
            //input del numero di incidenti
            switch (incidenti) { // verifico il numero di incidenti
                case 0:
                    break; // non aumento
                case 1:
                    prezzo *=1.15; // applico maggiorazione
                    break;  
                case 2:
                    prezzo *=1.30; //applico maggiorazione
                    break;
                case 3:
                    prezzo *=1.30; //applico maggiorazione
                    break;  

                default:
                    idoneo =false; // rilevo non idoneità
                    break;
            }
            if (idoneo){//se idoneo è true continuo
                System.out.println("inserisci il pacchetto desiderato");
                pacchetto = myScannerStr.nextLine();
                //input del pacchetto scelto
                if(pacchetto.equals("Intermedio")){ // controllo se il pacchetto è intermedio
                    prezzo *=1.2; //applico maggiorazione
                }else if (pacchetto.equals("Premium")){// cpntrollo se il pacchetto è premium
                    prezzo *=1.5; // applico maggiorazione
                }
            }

        System.out.println("Il tuo preventivo è di: "+prezzo); // stampo il prezzo calcolato
            


        }else{//altrimenti termino con messaggio
            System.out.println("Non sei idoeno");
        }





    }
}
