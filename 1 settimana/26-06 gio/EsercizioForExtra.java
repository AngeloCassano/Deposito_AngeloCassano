import java.util.Scanner;

public class EsercizioForExtra{
    public static void main(String[] args) {
        Scanner scannerNum = new Scanner(System.in);
        //creo lo scanner per i numeri
        Scanner scannerStr = new Scanner(System.in);
        //creo lo scanner per le stringhe       
        int numerovoti, voto;
        //creo le variabili intere di cui ho bisogno
        String nome, risposta;
        //variabili stringa del nome e della risposta
        int valido=0;
        //creo il contatore dei numeri validi inseriti
        

        System.out.println("Vuoi calcolare una media (s/n) ?");
        risposta = scannerStr.nextLine();
        //input della risposta se vuole continuare a calcolare una media     
        while (risposta.equals("s") || (risposta.equals("n"))){ //ciclo finchè la risposta è "s" o "n" 
        
        if (risposta.equals("n")) { // se la risposta è n 
                break; // termino il ciclo
            }
        
        System.out.println("Inserisci il numero di voti");
        numerovoti = scannerNum.nextInt();
        //input del numero di voti    
        //in input prendo il numero di voti
        while (numerovoti<=0){
            System.out.println("Il numero di voti non è valido. Inserisci un nuovo valore");
            numerovoti= scannerNum.nextInt();
            //stampo il messaggio che indica il valore non valido e ne acquisisco uno nuovo
        }
        for(int i=1; i<=numerovoti; i++){ //ciclo da 1 fino al numnero di voti
            
            System.out.println("Inserisci il voto (0-30)");
            voto = scannerNum.nextInt();
            //input di un voto
            if(voto<0 || voto>30){ // se il voto è fuori range
                System.out.println("Voto non valido");
            }else if (voto>=18 && voto<24){ // se il voto è in range 18-24
                System.out.println("voto sufficiente");
                //stampo messaggio 
                valido++; // incremento il contatore di numeri validi

            } else if(voto>=24 && voto<=30 ){ // se il voto è in range 24-30
                System.out.println("Buono o Ottimo");
                //stampo messaggio
                valido++; //incremento il contatore di numeri validi

            }else{
                System.out.println("Insufficiente");
                //stampo messaggio
                valido++; //incremento il contatore di numeri validi
            }

               
        }
        System.out.println("Numero di voti validi inseriti: " + valido);
        //stampo numero di voti validi
        System.out.println("Vuoi calcolare una media (s/n) ?");
        risposta = scannerStr.nextLine();
        //input della risposta se vuole continuare a calcolare una media 




    }

    }
}