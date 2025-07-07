import java.util.ArrayList;
import java.util.Scanner;

public class GestioneScuola {
    public static void main(String[] args) {
        ArrayList<Persona2> membriScuola = new ArrayList<>(); // creo la lista dei membri di una scuola
        /*membriScuola.add(new Docente("d1", 38, "Storia"));
        membriScuola.add(new Docente("d2", 45, "Geografia"));
        membriScuola.add(new Docente("d3", 39, "Matematica"));
        membriScuola.add(new Studente3("s1", 17, "3A"));
        membriScuola.add(new Studente3("s2", 17, "3A"));
        membriScuola.add(new Studente3("s3", 18, "4B"));
        membriScuola.add(new Studente3("s4", 18, "4B"));
        membriScuola.add(new Studente3("s5", 18, "4B"));
        for (Persona2 p : membriScuola){
            p.descriviRuolo();
            if( p instanceof Docente){
                Docente doc = (Docente) p;
                doc.registrazione();
            }else{
                Studente3 studente = (Studente3) p;
                studente.registrazione();
            }
        */
    Scanner scannerNum = new Scanner(System.in);
    Scanner scannerStr = new Scanner(System.in);
    // creato gli scanner
    int codice; //valore del comando selezionato
        String continua = new String(); // stringa per continuare
        
        do {
            System.out.println("Inserisci il codice per l'operazione desiderata:");
            System.out.println("1 Inserisci uno Studente"); 
            System.out.println("2 inserisci un Docente");
            System.out.println("3 Stampa la descrizione del ruolo");
            System.out.println("4 stampa il metodo di registrazione");//stampa menu
            codice = scannerNum.nextInt(); //input del codice selezionato
            switch (codice) {
                case 1:// Inserisci uno Studente
                    System.out.println("Inserisci il nome dello studente");
                    String nome = scannerStr.nextLine(); 
                    //input nome studente
                    System.out.println("Inserisci l'età dello studente");
                    int eta = scannerNum.nextInt();
                    //input eta dello studente
                    System.out.println("Inserisci la classe dello studente");
                    String classe = scannerStr.nextLine();
                    //input della classe dello studente
                    membriScuola.add(new Studente3(nome, eta, classe)); //aggiungo lo studente alla lista
                    break;
            
                case 2:// inserisci un Docente
                    System.out.println("Inserisci il nome del docente");
                    String nomeDocente = scannerStr.nextLine(); 
                    //input nome docente
                    System.out.println("Inserisci l'età del docente");
                    int etaDocente = scannerNum.nextInt();
                    //input eta del docente
                    System.out.println("Inserisci la materia del docente");
                    String materia = scannerStr.nextLine();
                    //input della materia del docente
                    membriScuola.add(new Docente(nomeDocente, etaDocente, materia)); //aggiungo il docente alla lista
                    break;

                case 3:// Stampa la descrizione del ruolo
                    for(Persona2 persona : membriScuola){
                        System.out.println("Il mio nome è "+ persona.getNome());
                        persona.descriviRuolo();
                    }
                    break;
                    
                case 4: //stampa il metodo di registrazione
                    for(Persona2 persona : membriScuola){
                        if( persona instanceof Docente){
                            Docente doc = (Docente) persona;
                            System.out.println("Modalità di registrazione per il docente "+doc.getNome()+" : ");
                            doc.registrazione();
                        }else{
                        Studente3 studente = (Studente3) persona;
                            System.out.println("Modalità di registrazione per lo studente "+studente.getNome()+" : ");
                            studente.registrazione();
                        }
                    }
                    break;
                default:
                    System.out.println("Codice dell'operazione errato"); //stampa codice non presente
                    break;
            }

            System.out.println("vuoi continuare? (si/no)"); //chiedo se vuole continuare
            continua = scannerStr.nextLine(); //input della risposta
        }while (!continua.equals("no")); //ciclo finchè continua è diverso da no

        }

}



abstract class Persona2 { //classe astratta persona
    private String nome;
    
    private int eta;
    //attributi della classe astratta

    public String getNome() {   //metodo get del nome
        return nome;
    }

    public void setNome(String nome) {//metodo get del nome
        this.nome = nome;
    }

    public int getEta() { //metodo get dell'età
        return eta;
    }

    public void setEta(int eta) {//metodo set dell'età
        this.eta = eta;
    }

    Persona2(String nome, int eta){//costruttore della classe astratta
        this.nome = nome;
        this.eta = eta;
    }

    abstract void descriviRuolo();
}

interface  Registrabile {
    void registrazione();
    
}

class Studente3 extends Persona2 implements Registrabile{
    

    private String classeFrequentata;
    //attributo della classe

    public String getClasseFrequentata() { // get della classe frequentata
        return classeFrequentata;
    }


    public void setClasseFrequentata(String classeFrequentata) { //set della classe frequentata
        this.classeFrequentata = classeFrequentata;
    }

    Studente3(String nome, int eta, String classeFrequentata){ //costruttore della classe
        super(nome, eta);
        this.classeFrequentata = classeFrequentata;
    }



    @Override
    public void registrazione() { //implemento metodo dell'interfaccia
       System.out.println("Registrazione tramite modulo online");
    }

    @Override
    void descriviRuolo() { //implemento metodo della classe astratta
        System.out.println("Sono uno studente della classe "+this.getClasseFrequentata());
    }
}

class Docente extends Persona2 implements Registrabile{

    private String materia;
    //attributo della classe
    
    
    
    
    public String getMateria() {//metodo get di materia
        return materia;
    }

    public void setMateria(String materia) {//metodo set di materia
        this.materia = materia;
    }

    Docente(String nome, int eta, String materia) { //costruttore della classe docente
        super(nome, eta);
       this.materia = materia;
    }

    @Override
    public void registrazione() { //implementazione metodo dell'interfaccia
        System.out.println("Registrazione tramite segreteria didattica");
    }

    @Override
    void descriviRuolo() { //implementazione metodo classe astratta
        System.out.println("Sono un docente di "+ this.getMateria());
    }

}
