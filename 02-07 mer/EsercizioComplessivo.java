import java.util.ArrayList;

public class EsercizioComplessivo {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Roma"); //creo un oggetto hotel
        Camera camera1 = new Camera(); //creo la camera 1
        camera1.setNumero(1); //assegno il numero di camera
        camera1.setPrezzo(70); //assegno il prezzo
        Camera camera2 = new Camera(); //creo la camera 2 
        camera2.setNumero(2); //assegno il numero di camera
        camera2.setPrezzo(75); //assegno il prezzo
        Suite suite1 = new Suite(); //creo la suite 1
        suite1.setNumero(3); //assegno il numero alla suite
        suite1.setPrezzo(150); //assegno il prezzo alla suite
        suite1.setServiziExtra("Minibar"); //assegno il servizio extra
        

    }
}

class Camera{ //classe base Camera
    private int numero;
    private float prezzo;
    //atributi della classe

    void setNumero(int numero){ // metodo set del numero
        this.numero = numero;
    }
    
    int getNumero(){ //metodo get del numero
        return this.numero;
    }

    void setPrezzo(float prezzo){//metodo set del prezzo
        this.prezzo= prezzo;
    }

    float getPrezzo(){ //metodo get del prezzo
        return this.prezzo;
    }

    void dettagli(){ // stampa i dettagli della camera
        System.out.println("La camera numero: "+this.getNumero()+" costa: "+ this.getPrezzo());
    }

    void dettagli(boolean conPrezzo){//stampa i dettagli della camere, di cui il prezzo solo se conPrezzo è true
        if (conPrezzo==true) {
            System.out.println("La camera numero: "+this.getNumero()+" costa: "+ this.getPrezzo());
        }else{
            System.out.println("Il numero della camera è : "+this.getNumero());
        }
    }

}

class Suite extends Camera{
    private String serviziExtra;
    //attributo della classe

    void setServiziExtra(String str){//metodo set dei servizi extra
        this.serviziExtra = str;
    }

    String getServiziExtra(){ //metodo get dei servizi extra
        return this.serviziExtra;
    }

    @Override
    void dettagli() { // override di dettagli con la stampa aggiuntiva dei servizi extra
        super.dettagli();
        System.out.println("I servizi extra sono: " +this.serviziExtra);
    }
}

class Hotel {
    private String nome;
    //attributo della classe

    private ArrayList<Camera> lista = new ArrayList<>();
    //attributo lista di camere

    Hotel(String nome){
        this.nome = nome;
    }

    void addCamera(Camera camera){ //aggiunge una camera alla lista
        lista.add(camera);
    }

    static int contaSuite(ArrayList<Camera> lista){ //conta le suite presenti nell'hotel
        int numero=0;
        for(Camera c : lista){
            if(c instanceof Suite){ // se c è una Suite
                numero++;   //incremento numero
            }
        }
        return numero;
    }

}