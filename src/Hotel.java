import java.util.HashMap;
import java.util.Map;

public class Hotel {
    private Map<Integer, Integer> personen = new HashMap<>();
    int aantalEenPersoonsKamers = 10; //kleine kamers = 2 personen
    int aantalKleineKamers = 10; //kleine kamers = 2 personen
    int aantalGroteKamers = 10; //kleine kamers = 5 personen
    int aantalFamilieKamers = 2; //kleine kamers = 10 personen
    int aantalPersonen = 100;
    boolean luxe = false;

    public void orderKleineKamer(int aantalKamersBesteld) {
        aantalKleineKamers = aantalKleineKamers - aantalKamersBesteld;
        aantalPersonen = aantalPersonen - 2 * aantalKamersBesteld;
    }

    public int getAantalKleineKamers() {
        return aantalKleineKamers;
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }
}
