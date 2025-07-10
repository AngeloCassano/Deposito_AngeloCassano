public class EsercizioFacade {
    public static void main(String[] args) {
        GestioneLuciFacade facade = new GestioneLuciFacade();
        facade.accendiTutte();
    }
}

// Sottosistema lucecamera che gestisce la luce nella camera
class LuceCamera {
    void accendi() { //accende la luce in camera
        System.out.println("Accesa la luce in camera");
    }
}

//sottosistema lucecucina che gestisce la luce nella cucina
class LuceCucina {
    void accendi() {//accende la luce in cucina
        System.out.println("Accesa la luce in cucina");
    }
}

// Facade
class GestioneLuciFacade {
    private LuceCamera lucecamera = new LuceCamera();
    private LuceCucina lucecucina = new LuceCucina();
    //attributi che contengono i sottosistemi gestiti da gestionelucifacade

    public void accendiTutte() { //richiama il metodo accendi degli attributi per accendere tutte le luci contestualmente
        lucecamera.accendi();
        lucecucina.accendi();
    }
}

