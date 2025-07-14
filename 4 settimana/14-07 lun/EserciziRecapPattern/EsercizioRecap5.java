/*Esercizio 5: Sistema di Login con Strategie di Autenticazione

Implementa un login che può usare diversi sistemi (password, token,
social login).

Usa Factory Method per istanziare la strategia di login.

Usa Facade per fornire un'interfaccia unica all'esterno.

 */

import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioRecap5 {
    public static void main(String[] args) {

        UserFacade facadeUserInterface = new UserFacade(); //creo un oggetto facade che sia l'interfaccia con l'utente
        facadeUserInterface.startMenu(); // richiamo il metodo menu
    }
    

}

interface Loginable{ //interfaccia per oggetti che permettano il login

    void login(String str); //metdo per effettuare il login di un utente
}


class UserFacade{ //classe che modella un interfaccia menu utilizzabile dall'utente
    ArrayList<Utente> listaUtenti = new ArrayList<>(); //lista degli utenti memorizzati
    

    public void startMenu(){ // metodo che permette all'utente di scegliere l'operazione da efettuar(registrazione o login)
        try(Scanner scannerNum = new Scanner(System.in); Scanner scannerStr = new Scanner(System.in)){// creato gli scanner all'interno di un try with resources
        int codice; //valore del comando selezionato
        String continua = new String(); // stringa per continuare
        
        do {
            System.out.println("Inserisci il codice per l'operazione desiderata:");
            System.out.println("1  Effettua registrazione"); 
            System.out.println("2  Effettua login");
            //stampa menu
            codice = scannerNum.nextInt(); //input del codice selezionato
            switch (codice) {
                case 1:// effettua registrazione
                    
                    System.out.println("Inserisci il tuo nome/username");
                    String usernameRegistrazione = scannerStr.nextLine();
                    System.out.println("Inserisci la tua password");
                    String password= scannerStr.nextLine();
                    System.out.println("Inserisci il tuo token d'accesso");
                    String token= scannerStr.nextLine();
                    System.out.println("Inserisci il nome del social d'accesso");
                    String social= scannerStr.nextLine();
                    //prendo in input i dati dell'utente e li memorizzo in variabili di tipo stringa
                    listaUtenti.add(new Utente(usernameRegistrazione, password, token, social)); //creo un nuovo utente con i dati presi in input e lo aggiungo alla lista degli utenti
                    break;
            
                case 2://effettua login
                    System.out.println("Inserisci il tuo username");
                    String usernameLogin = scannerStr.nextLine();
                    //richiedo in input l'username dell'utente
                    System.out.println("Inserisci la tua modalità di login (password/token/social)");
                    String tipoLogin = scannerStr.nextLine();
                    //richiedo il tipo di login desiderato
                    for(Utente user : listaUtenti){ //scansionando la lista degli utenti
                        if(user.checkUsername(usernameLogin)){ // se l'username in input
                            if(tipoLogin.equals("password")){ //se il tipo scelto è login con password
                                CreatorLoginPassword creatorloginpass = new CreatorLoginPassword(user); // creo un oggettp creator loginpassword
                                Loginable loginpass = creatorloginpass.factoryMethod(); //istanzio un oggetto loginable con il metodo factorymethod
                                System.out.println("Inserisci la password"); 
                                loginpass.login(scannerStr.nextLine()); //richiedo la password in input e invoco login con essa come parametro

                            }else if(tipoLogin.equals("token")){ //se il tipo scelto è login con token
                                CreatorLoginToken creatorloginpass = new CreatorLoginToken(user); // creo un oggettp creator logintoken
                                Loginable logintoken = creatorloginpass.factoryMethod(); //istanzio un oggetto loginable con il metodo factorymethod
                                System.out.println("Inserisci il token");
                                logintoken.login(scannerStr.nextLine()); //richiedo il token in input e invoco login con esso come parametro

                            }else if(tipoLogin.equals("social")){//se il tipo scelto è login con social
                                CreatorLoginSocial creatorloginsocial = new CreatorLoginSocial(user);// creo un oggettp creator loginsocial
                                Loginable loginsocial = creatorloginsocial.factoryMethod(); //istanzio un oggetto loginable con il metodo factorymethod
                                System.out.println("Inserisci il social");
                                loginsocial.login(scannerStr.nextLine());//richiedo il social in input e invoco login con esso come parametro

                            }else{
                                System.out.println("Tipo login non valido");
                            }
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
    } catch (Exception e) {
        e.printStackTrace();
    }
    }


}


// LoginPassword implementa Product
 class LoginPassword implements Loginable {
    private Utente user;
    
    LoginPassword(Utente user){
        this.user=user;
    }

    @Override
    public void login(String password) {
        if(user.checkPassword(password)){
            System.out.println("Login con password effettuato con successo");
        }else{
            System.out.println("Password errata");
        }
        
    }
}

// LoginToken
 class LoginToken implements Loginable {
    private Utente user;
    LoginToken(Utente user){
        this.user=user;
    }
    @Override
    public void login(String token) {
        if(user.checkToken(token)){
            System.out.println("Login con token effettuato con successo");
        }else{
            System.out.println("Token errato");
        }
    }
}

// LoginSocial
 class LoginSocial implements Loginable {
    private Utente user;
    LoginSocial(Utente user){
        this.user=user;
    }
    @Override
    public void login(String social) {
        System.out.println("Esecuzione di ConcreteProductB.operation()");
    }
}


//
 abstract class CreatorLogin {
    private Utente user;
    
    CreatorLogin(Utente u){
        this.user=u;
    }
    // Factory Method: restituisce un Product
    public abstract Loginable factoryMethod();

    public Utente getUser() {
        return user;
    }
}

// 
 class CreatorLoginPassword extends CreatorLogin {
    
    CreatorLoginPassword(Utente u) {
        super(u);
    }

    @Override
    public Loginable factoryMethod() {
        return new LoginPassword(super.getUser());
    }
}

//  
 class CreatorLoginToken extends CreatorLogin {
    CreatorLoginToken(Utente u) {
        super(u);
    }

    @Override
    public Loginable factoryMethod() {
        return new LoginToken(super.getUser());
    }
}

// 
 class CreatorLoginSocial extends CreatorLogin {
    
    CreatorLoginSocial(Utente u) {
        super(u);
    }

    @Override
    public Loginable factoryMethod() {
        return new LoginSocial(super.getUser());
    }
}

class Utente{
    

    private String username;
    private String password;
    private String token;
    private String social;

    public Utente(String username, String password, String token, String social){
        this.username = username;
        this.password = password;
        this.token = token;
        this.social = social;
    }

    public boolean checkUsername(String username) {
        if(this.username.equals(username)){
            return true;
        } else{
            return false;
        }
    }


    public boolean checkPassword(String password) {
        if(this.password.equals(password)){
            return true;
        } else{
            return false;
        }
    }

    public boolean checkToken(String token) {
        if(this.token.equals(token)){
            return true;
        } else{
            return false;
        }
    }

    public boolean checkocial(String social) {
        if(this.social.equals(social)){
            return true;
        } else{
            return false;
        }
    }
}