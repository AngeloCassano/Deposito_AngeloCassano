import java.util.Arrays;

public class ProvaString {
    public static void main(String[] args) {
        //dichiaro una stringa txt
        String txt = "ABcdEFG";
        // stampo la lunghezza della stringa txt
        System.out.println("The length is: "+ txt.length());

        //stampo txt mettendo tutte le lettere in maiuscolo
        System.out.println(txt.toUpperCase());
        //stampo txt mettendo tutte le lettere in minuscolo
        System.out.println(txt.toLowerCase());

        //dichiaro e avvaloro txt2
        String txt2 = "Please locate where 'locate' occurs!";
        //stampo la poszione di locate nella stringa txt2
        System.out.println(txt2.indexOf("locate"));

        //stampo il risultato della concatenazione di firstName con lastName
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        //stampa per provare l'uso del backslash per trasformare i caratteri speciali in stringa
        System.out.println("We are the so-called \"Vikings\" from the north");
        
        //stampo per provare \n
        System.out.print("ab"+ "\n" + "ac");

        //stampo per provare \r
        System.out.println("ab" +"\r" +"ac");

        // stampo per provare \t
        System.out.println("\tav");

        //stampo per prvare \b
        System.out.println("a \b"+"bb");

        //stampo per provare \f
        System.out.println("aa" +"\f"+"bb");

        //dichiaro e inizializzo la stringa str
        String str = "Hello World";
        //divido la stringa str nelle sue sottostringhe separate da spazi e le stampo
        String[] words = str.split("\\s");
        System.out.println(Arrays.toString(words));

        //dichiarazione e inizializzazione stringa
        String descrizione = "Articolo sulle stringhe ...";
        //inizializzo e metto la lunghezza di descrizione in length e lo stampo
        int length = descrizione.length();
        System.out.println("lunghezza di descrizione:" +length);
        //dichiaro una stringa vuota
        String str2 ="";
        //stampo la lunghezza di str2
        System.out.println("lunghezza di str2:" +str2.length());
        
        //stampa di prova metodo contains
        System.out.println("descrizione contiene la stringa \"sulle\" ?");
        System.out.println(descrizione.contains("sulle"));

        //stampa di prova metodo equals 
        System.out.println("descrizione è uguale a str2?");
        System.out.println(descrizione.equals(str2));

        //stampa di prova metodo isEmpty
        System.out.println("str2 è una stringa vuota?");
        System.out.println(str2.isEmpty());

    }
}
