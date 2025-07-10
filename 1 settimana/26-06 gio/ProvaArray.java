public class ProvaArray {
    public static void main(String[] args) {
        //dichiarazione e inizializzazione 
        int[] numeri = new int[5];
        //array vuoto di dimensione 5

        int[] valori = {1,2,3,4,5};
        //inizializzazione diretta

        int[] numeri2 = {10, 20, 30, 40, 50};
        System.out.println("Secondo numero: " + numeri2[1]);
        //creo un array e stampo il numero in seconda posizione

        int[] numeri3 = new int[5];
        //dichiarazione di un array di 5 elementi

        //riempimento dell'array con i numeri 1-5
        for(int i =0; i< numeri3.length; i++){
            numeri3[i] = i+1;
        }

        //stampa degli elementi dell'array
        System.out.println("Elementi dell'array:");
        for(int i=0; i<numeri3.length; i++){
            System.out.print(numeri3[i]+ " ");
        }

        //array 2d
        int [][] matrice = new int[3][3];

        //inizializzazione diretta
        int[][] matricePredefinita = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Elemento centrale: "+ matricePredefinita[1][1]);

        int [][] matrice2 = new int[3][3]; //dichiarazione di una matrice 3x3
        int valore = 1;
        
        //riempimento della matrice con numeri progressivi
        for(int i=0; i<matrice2.length; i++){
            for (int j=0; j<matrice2[i].length; j++){
                matrice2[i][j] = valore++;
            }
        }
        
        //stampa della matrice 
        System.out.println("Matrice 3x3");
        for (int i=0; i<matrice2.length; i++){
            for(int j=0; j<matrice[i].length; j++){
                System.out.print(matrice2[i][j] + "\t");
        }}
        System.out.println(); // nuova riga per formattare la matrice
    }
}
