import java.util.Scanner;

class UtilitaMatematica{
    static int quadrato(int num){ //metodo statico
        return num*num;
    }
        int cubo(int num) { //metodo non statico
            return num*num*num;    
        }
}


public class ProvaFunzioni2 {

    static int fattoriale (int n){ //funzione che calcola il fattoriale in modo ricorsivo
        if(n==1) return 1;
        return n*fattoriale(n-1);
    }


    public static void main(String[] args) {
        Scanner scannerNum = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        //creo gli scanner per i due tipi
        int numero;
        String risposta = new String();
        //creo le variabili degli input
        do{
            System.out.println("Inserisci il numero di cui calcolare il fattoriale");
            numero= scannerNum.nextInt(); //input del numero
            System.out.println("Il fattoriale di "+numero+" è "+ fattoriale(numero) );
            System.out.println("Vuoi continuare? (si/no)"); 
            risposta = scannerStr.nextLine();   //input della stringa
        }while(!risposta.equals("no")); //cicla finchè la risposta è diversa da no

        System.out.println(UtilitaMatematica.quadrato(5));//nessun oggetto necessario
            UtilitaMatematica obj = new UtilitaMatematica();
            System.out.println(obj.cubo(5)); //oggetto necessario
    
    }
}
