public class ProveInterfaccia {
    public static void main(String[] args) {
        Pig2 myPig = new Pig2();
        myPig.animalSound();
        myPig.sleep();
    }
}

interface Animal2{
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

class Pig2 implements Animal2{
    public void animalSound(){
        System.out.println("THe pig says: wee wee");
    }

    public void sleep(){
        System.out.println("Zzz");
    }
}


