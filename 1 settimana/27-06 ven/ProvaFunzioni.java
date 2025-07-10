import java.util.Scanner;

public class ProvaFunzioni {
    
    static void saluta(){
        System.out.println("ciao, java!"); //stampa un messaggio di saluto
    }

    //funzione che prende due interi e restituisce la somma
   static int somma(int a, int b){
     return a + b; //restituisci a+b
   }
   
   //fnzione che prende un numero e stampa il valore di quel numero+10
   static void mostra(int numero){
    System.out.println("Numero: " +(10+numero)); 
   }
   
   //funzione che prende una stringa e la stampa
   static  void mostra(String testo){
    System.out.println("Testo:" +testo);
   }
   
   //funzione che prende un numero e restituisce il fattoriale dopo averlo calcolato
   static int fattoriale(int numero){
   if (numero>0){
    int fattoriale =1;
    for(int i=0; i<numero; i++){ //ciclo numero volte
        fattoriale *= (numero-i); //moltiplico fattoriale per il numero decrementato del contatore
    }
    return fattoriale;
        }else{
            return -1;
    }
   }

   //funzione che prende una stringa e stampa il numero di caratteri che la compongono
   static int fattoriale(String str){
        System.out.println(str.length());
        return -1;

   }

    public static void main(String[] args) {
        Scanner scannerNum = new Scanner(System.in); // creo uno scanner per i numeri
        Scanner scannerStr = new Scanner(System.in); // creo uno scanner per i str
        String risposta= new String();

        saluta();// chiamata del metodo
        System.out.println(somma(10, 20)); //Output: 30 //stampo il risultato della funzione somma
        mostra(10); //chiama mostra(int)
        mostra("Ciao"); //chiama mostra(String)

        System.out.println("il fattoriale di 5 è: " +fattoriale(5)); //stampa il fattoriale di 5
        fattoriale("ciao"); //passo una stringa a fattoriale

        do{
            System.out.println("vuoi calcolare il fattoriale di un numero? (si/no)"); 
            risposta= scannerStr.nextLine(); //input della risposta dell'utente
            if (risposta.equals("si")){ //se la risposta è si
                System.out.println("Inserisci il numero di cui calcolare il fattoriale"); 
                int numero = scannerNum.nextInt(); //input del numero
                System.out.println("Il fattoriale è:" + fattoriale(numero)); //stamoo il risultato del fattoriale
            }
            

        }while(!risposta.equals("no")); //ciclo finchè la stringa non è "No"



    
    }

    

}
