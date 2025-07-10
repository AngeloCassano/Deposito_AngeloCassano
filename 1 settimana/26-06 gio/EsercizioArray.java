import java.util.Scanner;

public class EsercizioArray {
    public static void main(String[] args) {
        String[] nomedolci = new String [10] ;
        int [] quantitadolci = new int [10];
        //creo i due array
        int numerodolci; //variabile numero dei dolci

        Scanner scannerNum = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        //creo i due scanner per str e num
        
        do{
        System.out.println("Inseerisci il numero di dolci diversi che vuoi (max 10, min 1)");
        numerodolci = scannerNum.nextInt();
        //input del numero di dolci diversi 
        if(numerodolci<0){ //se il numero di dolci è negativo
            System.out.println("Valore negativo non valido");
        }
        }while (numerodolci<0 || numerodolci>10); // finchè il numero di dolci è al di fuori del range


        for(int i=0; i<numerodolci; i++){
            System.out.println("Inserisci il nome dei dolci che vuoi");
            nomedolci[i] = scannerStr.nextLine();
            //inserisco un nome di dolce
            int numerodolcitemp; //creo un una variabile temporanea
            do{
            System.out.println("Quanti ne vuoi?"); 
            numerodolcitemp = scannerNum.nextInt();
            //memorizzo il numero di dolci in una variabile temp
            if(numerodolcitemp<0){ //se il numero di dolci è negativo
                System.out.println("Valore negativo non valido"); //stampo messaggio
            }    
            }while(numerodolci<0); //finchè il numero di dolci è negativo
            quantitadolci[i] = numerodolcitemp; // inserisco nell'array il valore controllato




        }
        for (int i=0; i<numerodolci; i++){ //ciclo per il numero di dolci diversi
            System.out.println("Hai richiesto : " + quantitadolci[i] + " di " + nomedolci[i]); //stampo l'elenco dei dati immessi

        }
        int totaledolci =0; //totale dei dolci da calcolare
        for(int i=0; i<numerodolci; i++){ //ciclo per il numero di dolci diversi
            totaledolci +=quantitadolci[i]; //sommo il numero di dolci di un tipo al totale
        }
        System.out.println("Il numero di dolci totale è: " + totaledolci); //stampo del numero di dolci



    }
}
