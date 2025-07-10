package observer;
public class EsercizioObserverMain {
    public static void main(String[] args) {
        StazioneMeteo stazioneMeteo = new StazioneMeteo(); // creo una stazione meteo
        stazioneMeteo.setTemperatura(23.5f); //cambio il valore dello stato (temperatura)
        stazioneMeteo.AggiungiDisplay(new DisplayConsole("displayConsole")); //aggiungo un display console
        stazioneMeteo.AggiungiDisplay(new DisplayMobile("displayMobile")); // aggiungo un display mobile
        stazioneMeteo.setTemperatura(23.0f); //cambio il valore della temperatura a 23 gradi

    }
}
