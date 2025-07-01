import java.util.ArrayList;

public class EsercizioIncapsulamento {
    public static void main(String[] args) {
        Studente1 s1 = new Studente1("angelo", 7); //creo l'oggetto studente s1
        System.out.println("Lo studente creato è: "+s1.getNome() +" con il voto di: "+s1.getVoto()); //stampo le info dello studente s1
        s1.setVoto(11); //tento di cambiare il valore di voto in 11
        s1.setVoto(10); //cambio il valore di voto in 10
        System.out.println("Lo studente: "+s1.getNome() +" con il nuovo voto di: "+s1.getVoto()); //stampo le info dello studente s1
        s1.setVoto(3); //cambio il valore di voto in 3
        System.out.println("Lo studente: "+s1.getNome() +" con il nuovo voto di: "+s1.getVoto()); //stampo le info dello studente s1
        ArrayList<Studente1> listaStudent = new ArrayList<>(); //creo un arraylist di studenti
        Studente1 s2 = new Studente1("giuseppe", 6); //creo l'oggetto studente s1
        System.out.println("Lo studente creato è: "+s2.getNome() +" con il voto di: "+s2.getVoto()); //stampo le info dello studente s2
        Studente1 s3 = new Studente1("antonio", 9); //creo l'oggetto studente s1
        System.out.println("Lo studente creato è: "+s3.getNome() +" con il voto di: "+s3.getVoto()); //stampo le info dello studente s3
        listaStudent.add(s1); //aggiungo lo studente s1 alla lista
        listaStudent.add(s2);  //aggiungo lo studente s2 alla lista
        listaStudent.add(s3);   //aggiungo lo studente s3 alla lista
        Studente1 searchedStudent = searchStudente(listaStudent, "antonio"); //in searchedstudent metto il risultato della funzione searchstudente
        if(searchedStudent!=null){ //se l'oggetto searched student non è vuoto
            System.out.println("Lo studente cercato è: "+searchedStudent.getNome() +" con il voto di: "+searchedStudent.getVoto());  //stampa info studente trovato
        }else{
            System.out.println("Studente non trovato"); //stampa messaggio non trovato
        }
       

    }



    static Studente1 searchStudente(ArrayList<Studente1> listaStudenti, String nome){
    for(Studente1 s : listaStudenti ){
        if(s.getNome().equals(nome)){
            return s;
        }
    }
    return null;
}
}




class Studente1{
    private String nome; //nome dello studente
    private int voto;   //voto dello studente
    static private int id = 0; // id dello studente, attirbuto statico, valore di partenza 0

    //costruttore di studente con parametri nome e voto
    public Studente1(String nome, int voto){
        this.nome = nome; // assegno il nome
        this.voto = voto; //assegno il voto
        id++; //autoincremento di id
    }

    String getNome(){ //get del valore di nome
        return this.nome;
    }

    int getVoto(){ //get del voto
        return this.voto;
    }

    void setVoto(int voto){ //set di nuovo valore del voto
        if(voto>=0 && voto<=10){ //se il voto è nel range corretto
            this.voto = voto; //mofifico l'attributo privato voto

        }else{
            System.out.println("Il voto inserito "+voto+" non è valido"); //messaggio di errore
        }

    }

  
}