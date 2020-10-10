import java.util.HashMap;
import java.util.Map;

public class Hotel {
    private Map<Integer, Integer> personen = new HashMap<>();
    int aantalKamers = 50; //kleine kamers = 2 personen
    int aantalPersonen = 100;
    double prijs = 50;
    boolean luxes = false;

    public void orderKamer(int aantalKamersBesteld) {
        if (aantalKamersBesteld < 0 || aantalKamersBesteld > aantalKamers) return;
        prijs = aantalKamersBesteld * 2 * prijs;
        aantalKamers = aantalKamers - aantalKamersBesteld;
        aantalPersonen = aantalPersonen - 2 * aantalKamersBesteld;
    }

    public void orderKamer(int aantalKamersBesteld, String luxe) {
        if (aantalKamersBesteld < 0 || aantalKamersBesteld > aantalKamers) return;
        aantalKamers = aantalKamers - aantalKamersBesteld;
        aantalPersonen = aantalPersonen - 2 * aantalKamersBesteld;
        if (luxe.equals("luxe")) luxes = true;
        if (luxes) {
            prijs = prijs * 1.5;
            prijs = aantalKamersBesteld * 2 * prijs;
        } else
            prijs = aantalKamersBesteld * 2 * prijs;
    }

    public void promotie(int aantalKamersBesteld) {
        prijs = prijs * 0.5;
    }

    public int getAantalKamers() {
        return aantalKamers;
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }

    public double getPrijs() {
        return prijs;
    }
}