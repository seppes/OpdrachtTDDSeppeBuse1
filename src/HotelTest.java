import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void orderKleineKamer() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        int aantalKleineKamers =  hotel.getAantalKamers();
        assertEquals(48,aantalKleineKamers);
    }

    @Test
    void orderKleineKamerNegatiefAantalKamers() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(-2);
        int aantalKleineKamers =  hotel.getAantalKamers();
        assertEquals(50,aantalKleineKamers);
    }

    @Test
    void orderKleineKamerTeVeelAantalKamers() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(12);
        int aantalKleineKamers =  hotel.getAantalKamers();
        assertEquals(38,aantalKleineKamers);
    }

    @Test
    void orderKleineKamerAantalPersonen() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        int aantalPersonenNogOver=  hotel.getAantalPersonen();
        assertEquals(96,aantalPersonenNogOver);
    }

    @Test
    void orderKleineKamerTeVeelAantalPersonen() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(60);
        int aantalPersonenNogOver=  hotel.getAantalPersonen();
        assertEquals(100,aantalPersonenNogOver);
    }

    @Test
    void orderPrijs() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        double prijs=  hotel.getPrijs();
        assertEquals(200,prijs);
    }

    @Test
    void orderLuxe() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2, "luxe");
        double prijs=  hotel.getPrijs();
        assertEquals(300,prijs);
    }

    @Test
    void orderLuxeFout() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2, "foute input");
        double prijs=  hotel.getPrijs();
        assertEquals(200,prijs);
    }

    @Test
    void orderMetPromotie() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.promotie(2);
        double prijs=  hotel.getPrijs();
        assertEquals(100,prijs);
    }

    @Test
    void orderLuxeMetPromotie() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2, "luxe");
        hotel.promotie(2);
        double prijs=  hotel.getPrijs();
        assertEquals(150,prijs);
    }

    @Test
    void orderLuxeMetPromotieEnOntbeid() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2, "luxe");
        hotel.promotie(2);
        hotel.ontbeid(2);
        double prijs=  hotel.getPrijs();
        assertEquals(190,prijs);
    }

    @Test
    void orderLuxeMetOntbeid() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2, "luxe");
        hotel.ontbeid(2);
        double prijs=  hotel.getPrijs();
        assertEquals(340,prijs);
    }

    @Test
    void orderMetOntbeid() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.ontbeid(2);
        double prijs=  hotel.getPrijs();
        assertEquals(240,prijs);
    }

    @Test
    void orderMetPromotieEnOntbeid() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.promotie(2);
        hotel.ontbeid(2);
        double prijs=  hotel.getPrijs();
        assertEquals(140,prijs);
    }

    @Test
    void orderMetTaxi() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.taxiToAirportService("09:30");
        double prijs=  hotel.getPrijs();
        assertEquals(250,prijs);
    }

    @Test
    void orderMetTaxiGeenTijdstip() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.taxiToAirportService("");
        double prijs=  hotel.getPrijs();
        assertEquals(200,prijs);
    }

    @Test
    void orderLuxeMetPromotieEnOntbeidEnTaxi() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2, "luxe");
        hotel.promotie(2);
        hotel.ontbeid(2);
        hotel.taxiToAirportService("13:15");
        double prijs=  hotel.getPrijs();
        assertEquals(240,prijs);
    }

    @Test
    void orderKleineKamerMetToegangZwembad() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.zwembadToegang();
        double prijs=  hotel.getPrijs();
        assertEquals(230,prijs);
    }
}