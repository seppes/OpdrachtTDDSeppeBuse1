import java.util.ArrayList;

public class Hotel {
    int aantalKamers = 50; //kleine kamers = 2 personen
    int aantalPersonen = 100;
    double prijs = 50;
    boolean promotie = false;
    boolean luxes = false;
    int aantalPersonenMogelijkInSpeeltuin = 20;
    ArrayList<Double> prijsLijst = new ArrayList<>();
    Double eindPrijs = 0.0;

    public void orderKamer(int aantalKamersBesteld) {
        if (aantalKamersBesteld < 0 || aantalKamersBesteld > aantalKamers) return;
        prijs = aantalKamersBesteld * prijs;
        aantalKamers = aantalKamers - aantalKamersBesteld;
        aantalPersonen = aantalPersonen - 2 * aantalKamersBesteld;
        prijsLijst.add(prijs);
        prijs = 50;
    }

    public void orderKamer(int aantalKamersBesteld, String extra) {
        if (aantalKamersBesteld < 0 || aantalKamersBesteld > aantalKamers) return;
        aantalKamers = aantalKamers - aantalKamersBesteld;
        aantalPersonen = aantalPersonen - 2 * aantalKamersBesteld;

        if (extra.equals("luxe")) {luxes = true;}
        if (luxes) {
            prijs = prijs * 1.5;
            prijs = aantalKamersBesteld * prijs;
        } else {
            prijs = aantalKamersBesteld * prijs;
        }
        prijsLijst.add(prijs);
        prijs = 50;
    }


    public Double getEindPrijs() {
        for (int i = 0; i < prijsLijst.size(); i++) {
            eindPrijs = eindPrijs + this.prijsLijst.get(i);
        }
        if (promotie){
            promotie =false;
            return eindPrijs/2;
        }else{
            return eindPrijs;
        }
    }

    public void promotie() {
        promotie =true;
    }

    public void ontbeid(int aantalKamersBesteld) {
        eindPrijs = eindPrijs + 20 * aantalKamersBesteld;
    }

    public void taxiToAirportService(String tijdstipOphaling) {
        if (tijdstipOphaling.equals("")) return;
        eindPrijs = eindPrijs + 50;
    }

    public void zwembadToegang() {
        eindPrijs = eindPrijs + 30;
    }

    public void roomService(int aantalKamersBesteld) {
        eindPrijs = eindPrijs + 20 * aantalKamersBesteld;
    }

    public void airco(int aantalKamersBesteld) {
        eindPrijs = eindPrijs + 10 * aantalKamersBesteld;
    }

    public void speeltuin(int aantalKinderenToevoegenInSpeeltuin) {
        if (aantalKinderenToevoegenInSpeeltuin < 0 || aantalKinderenToevoegenInSpeeltuin > 20) return;
        aantalPersonenMogelijkInSpeeltuin = aantalPersonenMogelijkInSpeeltuin - aantalKinderenToevoegenInSpeeltuin;
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

    public int getAantalPersonenMogelijkInSpeeltuin() {
        return aantalPersonenMogelijkInSpeeltuin;
    }
}