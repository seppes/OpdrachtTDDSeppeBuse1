import java.util.HashMap;
import java.util.Map;

public class Hotel {
    private Map<Integer, Integer> personen = new HashMap<>();
    int aantalEenPersoonsKamers = 10; //kleine kamers = 2 personen
    int aantalKleineKamers = 10; //kleine kamers = 2 personen
    int aantalGroteKamers = 10; //kleine kamers = 5 personen
    int aantalFamilieKamers = 2; //kleine kamers = 10 personen
    int aantalPersonen = 100;
    double prijs = 50;
    boolean luxes = false;

    public void orderKleineKamer(int aantalKamersBesteld) {
        if (aantalKamersBesteld < 0 || aantalKamersBesteld > aantalKleineKamers) return;
        prijs = aantalKamersBesteld * 2 * prijs;
        aantalKleineKamers = aantalKleineKamers - aantalKamersBesteld;
        aantalPersonen = aantalPersonen - 2 * aantalKamersBesteld;
    }

    public void orderKleineKamer(int aantalKamersBesteld, String luxe) {
        if (aantalKamersBesteld < 0 || aantalKamersBesteld > aantalKleineKamers) return;
        aantalKleineKamers = aantalKleineKamers - aantalKamersBesteld;
        aantalPersonen = aantalPersonen - 2 * aantalKamersBesteld;

        if (luxe.equals("luxe")) luxes = true;
        if (luxes) {
            prijs = prijs * 1.5;
            prijs = aantalKamersBesteld * 2 * prijs;
        } else
            prijs = aantalKamersBesteld * 2 * prijs;
    }

    public int getAantalKleineKamers() {
        return aantalKleineKamers;
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }

    public double getPrijs() {
        return prijs;
    }
}
