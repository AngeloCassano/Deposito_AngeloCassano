import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioAdapter2 {
    public static void main(String[] args) {
        LegacyUserSystem legacySystem = new LegacyUserSystem();//creato il legacyUserSystem
        UserManagementAdapter userManagementAdapter = new UserManagementAdapter(legacySystem);
        try(Scanner scannerNum = new Scanner(System.in); Scanner scannerStr = new Scanner(System.in)){// creato gli scanner all'interno di un try with resources
        int codice; //valore del comando selezionato
        String continua = new String(); // stringa per continuare 
        do {
            System.out.println("Inserisci il codice per l'operazione desiderata:");
            System.out.println("1 Inserisci un utente nel sistema "); 
            System.out.println("2  Rimuovi un utente nel sistema");
            System.out.println("3  Verifica la presenza di un utente nel sistema");
            //stampa menu
            codice = scannerNum.nextInt(); //input del codice selezionato
            switch (codice) {
                case 1://Inserisci un utente nel sistema
                    System.out.println("Inserisci il nome dell'utente che vuoi inserire");//messaggio richiesta inserimento
                    userManagementAdapter.createUser(scannerStr.nextLine()); //inserimento dell'utente nel sistema legacy attraverso l'adattatore
                    System.out.println("Utente inserito");
                    break;
            
                case 2://Rimuovi un utente nel sistema
                    System.out.println("Inserisci il nome dell'utente che vuoi rimuovere");//messaggio richiesta inserimento
                    userManagementAdapter.deleteUser(scannerStr.nextLine()); //rimuovo l'utente nel sistme management legacy attravero l'adattatore
                    break;

                case 3://Verifica la presenza di un utente nel sistema
                    System.out.println("Inserisci il nome dell'utente di cui vuoi verificare la presenza");//messaggio richiesta inserimento
                    boolean foundUser = userManagementAdapter.findUser(scannerStr.nextLine());
                    if(foundUser){
                        System.out.println("Utente trovato");
                    }else{
                        System.out.println("Utente non trovato");
                    }
                    
                    break;
                    
                default:
                    System.out.println("Codice dell'operazione errato"); //stampa codice non presente
                    break;
            }

            System.out.println("vuoi continuare? (si/no)"); //chiedo se vuole continuare
            continua = scannerStr.nextLine(); //input della risposta
        }while (!continua.equals("no")); //ciclo finchè continua è diverso da no
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}

interface UserManagement{ //interfaccia con i metodi attuali di gestione dell'utente
    void createUser(String nomeUtente); //aggiunge un utente
    void deleteUser(String nomeUtente); //elimina un utente
    boolean findUser(String nomeutente); //cerca un utente
}

class LegacyUserSystem {// classe legacy che si occupava della gestione degll'utente 
    private ArrayList<String> legacyUsers = new ArrayList<>();
    //lista degli utenti gestita in modo legacy


    void addUser(String nomeUtente){//aggiunge un utente alla lista
        this.legacyUsers.add(nomeUtente);
    };
    
    void removeUser(String nomeUtente){//elimina un utente 
        this.legacyUsers.remove(nomeUtente);
    };

    boolean searchUser(String nomeUtente){//cerca un utente nella lista
        boolean trovato=false;
        for(String utente : legacyUsers ){
            if (utente.equals(nomeUtente)){
                trovato = true;
                break;
            }
        }
        return trovato;
    };

    
}

class UserManagementAdapter implements UserManagement{//adattatore per oggetti di LegacyUserSystem
    private LegacyUserSystem legacyUser; //oggetto LegacyUserSystem

    UserManagementAdapter(LegacyUserSystem legacyUser){ //costruttore di UserManagementAdapter
        this.legacyUser = legacyUser;
    }

    @Override
    public void createUser(String nomeUtente) { // aggiunge un utente alla lista nell'oggetto legacy
        legacyUser.addUser(nomeUtente);
    }

    @Override
    public void deleteUser(String nomeUtente) {// rimuove un utente alla lista nell'oggetto legacy
       legacyUser.removeUser(nomeUtente);
    }

    @Override
    public boolean findUser(String nomeutente) { // ricerca un utente alla lista nell'oggetto legacy
        return legacyUser.searchUser(nomeutente);
    }

    

}