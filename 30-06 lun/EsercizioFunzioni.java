import java.util.Scanner;

public class EsercizioFunzioni {
    static int somma(int num1, int num2){ //funzione che somma due numeri interi
    return num1+num2;
}

static int multiply(int num1, int num2){//funzione che restituisce il prodotto di due interi
    return num1*num2;
}

static double multiply(double num1, double num2, double num3){ //funzione che restituisce il prodotto di tre numeri in virgola mobile

    return num1*num2*num3;
}

//funzione che somma i primi n numeri naturali
static int sommaNaturali(int n){
    if (n==1){ //se n=1 restituisco 1
        return n;
    }
    return n+sommaNaturali(n-1);
}

//funzione che modifica un intero
static void modifica(int num){
    num+=50;
}

//funzione che modifica un array
static void modifica(int[] array, int posizione){
    array[posizione]+= 50;
}

    public static void main(String[] args) {
         // stampa di prova System.out.println("La somma dei primi 5 numeri naturali è: " +sommaNaturali(5));
        Scanner scannerNum = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        //creato gli scanner
        int numesercizio, intero1, intero2; //creato gli interi
        double decimale1, decimale2, decimale3; //creato i numeri in virgola mobile
        String risposta = new String(); //creo la stringa della risposta
        do{
            System.out.println("Quale esercizio vuoi provare? Inserisci un numero tra 1 e 4"); //stampa messaggio
            numesercizio = scannerNum.nextInt(); //input numero esercizio
            switch (numesercizio) {
                case 1:
                    System.out.println("inserisci il primo intero");
                    intero1 = scannerNum.nextInt(); //input primo intero
                    System.out.println("Inserisci secondo intero");
                    intero2 = scannerNum.nextInt(); //input secondo intero1
                    System.out.println("La somma dei due interi è:" + somma(intero1, intero2));
                    break;
            
                case 2:
                    System.out.println("cosa vuoi moltiplicare due interi o tre numeri in virgola mobile? Inserisci(interi/decimali)");//stampa messaggio
                    risposta = scannerStr.nextLine();//input risposta
                    if(risposta.equals("interi")){
                        System.out.println("inserisci il primo intero");
                        intero1 = scannerNum.nextInt(); //input primo intero
                        System.out.println("Inserisci secondo intero");
                        intero2 = scannerNum.nextInt(); //input secondo intero1
                        System.out.println("Il prodotto dei due interi è:" + multiply(intero1, intero2));

                    }else if(risposta.equals("decimali")){
                        System.out.println("inserisci il primo decimale");
                        decimale1 = scannerNum.nextDouble(); //input primo decimale
                        System.out.println("Inserisci secondo decimale");
                        decimale2 = scannerNum.nextDouble(); //input secondo decimale
                        System.out.println("Inserisci terzo decimale");
                        decimale3 = scannerNum.nextDouble(); //input terzo decimale
                        System.out.println("Il prodotto dei tre decimali è:" + multiply(decimale1, decimale2, decimale3));
                    }
                    break;
                case 3: 
                    System.out.println("Inserisci n d numeri naturali da sommare tra di loro"); //stampa messaggio
                    intero1 = scannerNum.nextInt();
                    System.out.println("la somme dei primi "+intero1+" numeri è: "+ sommaNaturali(intero1));

                    break; 
                case 4:
                    int[] numeri = {12, 17, 29};
                    System.out.println("inserisci il valore per la variabile intero"); //stampa messaggio
                    intero1 = scannerNum.nextInt(); //input del valore dell'intero
                    int posizione; //creo la variabile posizione nell'array
                    modifica(intero1); // modifico la variabile
                    System.out.println("Il risultato della funzione modifica sulla variabile è "+intero1 );
                        do{
                        System.out.println("Inserisci la posizone dell'elemento dell'array{12,17,29} da modificare. Posizione tra 1 e 3");
                        posizione = scannerNum.nextInt(); //input posizione dell'array desiderata
                        }while(posizione<1 && posizione>3); 
                        modifica(numeri, posizione); 
                        System.out.println("Il valore dell'elemento in posizione " +posizione +"è: "+ numeri[posizione]);

                    break;
                default:
                    System.out.println("numero inserito non valido");
                    break;
            }
            
 

            System.out.println("Vuoi continuare? (si/no)"); //chiedo se continuare
            risposta = scannerStr.nextLine(); //input della risposta

        }while(!risposta.equals("no"));


       

    }
}
