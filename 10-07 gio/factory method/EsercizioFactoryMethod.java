import java.util.Scanner;

public class EsercizioFactoryMethod {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        System.out.println("Che tipo di forma vuoi creare");
        IShape shape;
        String tipo = scannerStr.nextLine();
        shape = ShapeCreator.CreateShape(tipo);
        shape.draw();
        FacadeShapes facade = new FacadeShapes(ShapeCreator.CreateShape("circle"), ShapeCreator.CreateShape("Square"));
        facade.drawAll();
    }
}

interface IShape{ // interfaccia del prodotto IShape
    void draw();
}

class Circle implements IShape{ //classe circle che implementa IShape

    @Override
    public void draw() {
        System.out.println("Disegnato un cerchio");
    }
    
}

class Square implements IShape{// classe square che implementa IShape

    @Override
    public void draw() {
        System.out.println("Disegnato un quadrato");
    }
    
}

abstract class ShapeCreator{ //classe astratta ShapeCreator 

    public abstract IShape factoryMethod();

    static IShape CreateShape(String type){//metodo statico che retituisce il tipo dell'oggetto contenuto nella stringa
        if(type.equalsIgnoreCase("circle")){
            return new CircleConcreteCreator().factoryMethod();
        }else if(type.equalsIgnoreCase("square")){
            return new SquareConcreteCreator().factoryMethod();
        }else{
            System.out.println("tipo non accettato");
            return null;
        }
    };
}

class CircleConcreteCreator extends ShapeCreator{ //classe che estende ShapeCreator e che permette di creare oggetti di circle
    public IShape factoryMethod(){
        return new Circle();
    }
}

class SquareConcreteCreator extends ShapeCreator{ //classe che estende ShapeCreator e che permette di creare oggetti di square
    public IShape factoryMethod(){
        return new Square();
    }
}

// classe facade che contiene il cerchio e il quadrato creati
class FacadeShapes {
    private IShape ishape1;
    private IShape ishape2;
    //attributi ishape della classe

    FacadeShapes(IShape ishape1, IShape ishape2){ //costruttore di FacadeShapes che prende i riferimenti ai due ishape della classe
        this.ishape1 = ishape1;
        this.ishape2 = ishape2;
    }


    public void drawAll() { //invoco il metodo disegno per i due ishape
        ishape1.draw();
        ishape2.draw();
    }
}


