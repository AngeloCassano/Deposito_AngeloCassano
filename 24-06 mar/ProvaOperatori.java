public class ProvaOperatori {
    public static void main(String[] args) {
        
        //dichiaro e inizializzo a x un valore
        int x= 10;
        // sommo il valore di x con 5
        x += 5;

        //dichiaro e inizializzo la variabile y e poi sottraggo 2 al suo valore
        int y = 4;
        y -= 2;

        //dichiaro e inizializzo la variabile z e poi la moltiplico per 2
        int z = 4;
        z *= 2;

        //dichiaro e inizializzo la variabile a e poi la divido per 2
        int a = 4;
        a /= 2;

         //dichiaro e inizializzo la variabile b e dichiaro la variabile c in cui inserisco il risultato di b modulo 2
        int b = 2;
        int c = b % 2;

        //provo l'operatore minore <
        System.out.println("5 minore di 3?");
        System.out.println(5<3);

        //provo l'operatore <=
        System.out.println("5 maggiore uguale di 5?");
        System.out.println(5<=5);

        //provo l'operatore >
        System.out.println("6 maggiore  di 7?");
        System.out.println(6>7);

        //provo l'operatore >=
        System.out.println("10 maggiore uguale di 10?");
        System.out.println(10>=10);

        //provo l'operatore ==
        int m = 5;
        int n =4;
        System.out.println("5  uguale a 4?");
        System.out.println(m==n);

        //provo l'operatore !=
        int o = 3;
        int p = 3;
        System.out.println("3  diverso da 3?");
        System.out.println(o!=p);
        
        //provo l'operatore &&
        System.out.println("x<5 && x<10?");
        System.out.println(m<5 && m<10);

         //provo l'operatore ||
        System.out.println("x<5 || x<4?");
        System.out.println(m<5 || m<4);

        //provo l'operatore !
        System.out.println("!(x<5 && x<10)?");
        System.out.println(!(m<5 && m<10));








    }
}
