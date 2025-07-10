public class ProveMath{
    public static void main(String[] args) {
        System.out.println(Math.max(5,10));
        //Math.max restituisce il valore più grande
        System.out.println(Math.min(5,10));
        //Math.min restituisce il calore più piccolo
        System.out.println(Math.sqrt(64));
        //Math.sqrt restutuisce la radice quadrata
        System.out.println(Math.abs(-4.7));
        //Math.abs restituisce il valore assoluto positivo
        //Math.random restituisce un numero casuale tra 0.0 e 1.0 (escluso)
        int randomNum = (int) (Math.random()*101);
        //come ottenere un numero tra 0 e 100 con Math.random
        System.out.println(randomNum);
        //stampo il numero random

    }
}