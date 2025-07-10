public class ProvaCondizioni{
    public static void main(String[] args) {
        if (20>18) {
            System.out.println("20 is greater than 18");
        }
        // se la condizione è vera stampo la stringa che riporta la condizione superata
        
        int x= 20;
        int y =10;
        // dichiaro le due variabili int che sto per utilizzare

        if(x>y){
            System.out.println("x is greater than y");
        }
        //se la variabile x è maggiore della variabile y stampo la stringa 

        int time = 20;
        //dichiaro la variabile che sto per utilizzare

        if(time<18){
            System.out.println("Good day.");
            //stampo una stringa nel blocco vero dell'if
        }else {
            System.out.println("Good evening.");
            //ramo false dell'if con stampa di un messaggio

        }

        int time2 =22;
        //dichiaro una nuova variabile

        if(time2 <10){
            System.out.println("Goof morning.");
            //stampa nel ramo true della condizione
        }else if(time2 <18){
            System.out.println("Good day.");
            //stampa nel ramo true della condizione dell'else if
        }else{
            System.out.println("Good evening.");
            //stampa nel ramo false dell'if
        }

        int time3 = 20;
        // dichiaro la variabile che mi serve
        String result = (time3 <18) ? "Good day." : "Good Evening.";
        //operatore ternario se la condizione è vera assegno alla variabile la prima stringa se false la seconda stringa
        System.out.println(result);

        int day = 4; //creo la variabile che mi serve
        switch (day) { //switch sulla variabile day
            case 1: //valore di day è 1
                System.out.println("Monday");
                break;
            case 2: //valore di day è 2
                System.out.println("Tuesday");
                break;
            case 3: //valore di day è 3
                System.out.println("Wednesday");
                break;
            case 4: //valore di day è 4
                System.out.println("Thursday");
                break;
            case 5: //valore di day è 5
                System.out.println("Friday");
                break;
            case 6: //valore di day è 6
                System.out.println("Saturday");
                break;
            case 7: //valore di day è 7
                System.out.println("Sunday");
                break;
            default: // il valore di day non è tra quelli precedenti
                System.out.println("Not a day");
                break;            
        }
    }
}