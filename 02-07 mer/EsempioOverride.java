public class EsempioOverride {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
        Bike2 obj2 = new Bike2();
        obj2.run();
        Universitario u1= new Universitario("luca", 20);
        System.out.println(u1); //chiama automaticamente toString()
    }

}
class Veicolo{
    //creazione di una classe genitore. definire un metodo
    void run(){System.out.println("Il veicolo è in marcia");}
}

class Bike2 extends Veicolo{
    void run(){System.out.println("La bici sta correndo in sicurezza");}//metodo della classe genitore
}

class Bike extends Veicolo{

}

 class Universitario{
    private String nome;
    private int eta;

    //costruttore
     Universitario (String nome, int eta){
        this.nome = nome;
        this.eta = eta; 
    }

    //override del metodo toString()
    @Override
    public String toString(){
        return "Universitario: "+ nome + ",Età: "+eta;
    }

}