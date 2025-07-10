public class ProvaStringhe {
    public static void main(String[] args) {
        //dichiaro e stampo una stringa
        String testo = "Prova";
        System.out.println(testo);
        
        //assegno un nuovo valore alla stringa precedente e stampo una concatenazione di stringhe
        testo = "Mondo";
        System.out.println("Ciao " + testo);  
        
        //assegno ad una variabile una concatenazione di stringhe e poi la stampo
        String firstPart = "Ciao ";
        String lastPart = "Mondo";
        String fullPart = firstPart + lastPart;
        System.out.println(fullPart);
        
        
    }
}
