import java.util.ArrayList;
public class ProvaPolimorfismo {
    public static void main(String[] args) {
        ArrayList<X> insiemeX = new ArrayList<>();
        X obj = new X();
        azionatore(obj);
    }

    static void azionatore(X obj){
        obj.azione();
    }
}

class X{
    void azione(){
        System.out.println("Azione X");
    }
}

class X1 extends X{
    void azione(){
        System.out.println("Azione X1");
    }
}

class X2 extends X{
    void azione(){
        System.out.println("Azione X2");
    }
}