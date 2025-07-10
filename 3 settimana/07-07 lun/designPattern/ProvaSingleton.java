package designPattern;

// Definizione della classe Singleton
public class ProvaSingleton 
{
  // Istanza privata statica della classe Singleton
  private static ProvaSingleton instance;

  // Costruttore privato per impedire l'istanziazione diretta
  private ProvaSingleton() {}
  
  // Metodo pubblico statico per ottenere l'unica istanza della classe
  public static ProvaSingleton getInstance() 
  {
    // Se l'istanza non esiste, viene creata
    if (instance == null) 
    {
      instance = new ProvaSingleton();
    }
    // Restituisce l'istanza esistente o appena creata
    return instance;
  }

  // Metodo di esempio che può essere chiamato sull'istanza Singleton
  public void DoSomething()
  {
    System.out.println("Singleton: DoSomething() called");
  }

  public static void main(String[] args) {
    ProvaSingleton.getInstance().DoSomething();
  }
}