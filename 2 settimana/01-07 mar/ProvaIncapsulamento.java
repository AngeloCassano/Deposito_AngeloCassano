public class ProvaIncapsulamento {
    public static void main(String[] args) {
        Worker myObj = new Worker();
        myObj.setName("Pippo"); // settiamo il valore name ="pippo"
        System.out.println(myObj.getName());
    }
}

class Worker {
    private String name; //private

    public String getName(){ //getter
        return name;
    }


    public void setName(String newName){ //Setter
        this.name = newName;
    }
}

 class Persona {
    //campi privati(incepsulamento)
    private String nome;
    private int eta;

    //costruttore pubblico
    public Persona(String nome, int eta){
        this.nome = nome;
        this.eta= eta;
    }
    
    //metodo privato utilizzato dalla classe
    private boolean verificaMaggiorenne(){
        return this.eta >=18;
    }

    //metodo pubblico che fa uso del metodo privato
    public void stampaStatus(){
        if(verificaMaggiorenne()){
            System.out.println(this.nome+ "è maggiorenne.");
        }else{
            System.out.println(this.nome + "non è maggiorenne");
        }
    }

}
