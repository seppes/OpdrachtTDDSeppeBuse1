import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void orderKleineKamer() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        int aantalKleineKamers = hotel.getAantalKamers();
        assertEquals(48, aantalKleineKamers);
    }

    @Test
    void orderKleineKamerNegatiefAantalKamers() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(-2);
        int aantalKleineKamers = hotel.getAantalKamers();
        assertEquals(50, aantalKleineKamers);
    }

    @Test
    void orderKleineKamerTeVeelAantalKamers() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(12);
        int aantalKleineKamers = hotel.getAantalKamers();
        assertEquals(38, aantalKleineKamers);
    }


    @Test
    void orderKleineKamerTeVeelAantalPersonen() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(60);
        int aantalPersonenNogOver = hotel.getAantalPersonen();
        assertEquals(100, aantalPersonenNogOver);
    }

    @Test
    void orderPrijs() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(100, eindPrijs);
    }

    @Test
    void orderLuxeEnGewoneKamer() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.orderKamer(2, "luxe");
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(250, eindPrijs);
    }

    @Test
    void orderLuxe() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2, "luxe");
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(150, eindPrijs);
    }

    @Test
    void orderTweeKeerLuxe() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2, "luxe");
        hotel.orderKamer(2, "luxe");
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(300, eindPrijs);
    }

    @Test
    void orderLuxeFout() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2, "foute input");
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(100, eindPrijs);
    }

    @Test
    void orderMetPromotie() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.promotie();
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(50, eindPrijs);
    }

    @Test
    void orderLuxeMetPromotie() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2, "luxe");
        hotel.promotie();
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(75, eindPrijs);
    }

    @Test
    void orderLuxeMetOntbeid() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2, "luxe");
        hotel.ontbeid(2);
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(190, eindPrijs);
    }

    @Test
    void orderMetOntbeid() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.ontbeid(2);
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(140, eindPrijs);
    }


    @Test
    void orderMetTaxi() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.taxiToAirportService("09:30");
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(150, eindPrijs);
    }

    @Test
    void orderMetTaxiGeenTijdstip() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.taxiToAirportService("");
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(100, eindPrijs);
    }


    @Test
    void orderKleineKamerMetToegangZwembad() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.zwembadToegang();
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(130, eindPrijs);
    }


    @Test
    void orderKleineKamerRoomService() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.roomService(2);
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(140, eindPrijs);
    }

    @Test
    void orderKleineAirco() {
        Hotel hotel = new Hotel();
        hotel.orderKamer(2);
        hotel.airco(2);
        double eindPrijs = hotel.getEindPrijs();
        assertEquals(120, eindPrijs);
    }


    @Test
    void orderSpeeltuinPlaats() {
        Hotel hotel = new Hotel();
        hotel.speeltuin(3);
        int aantalKinderenInSpeeltuin = hotel.getAantalPersonenMogelijkInSpeeltuin();
        assertEquals(17, aantalKinderenInSpeeltuin);
    }

    @Test
    void orderSpeeltuinPlaatsNegatief() {
        Hotel hotel = new Hotel();
        hotel.speeltuin(-3);
        int aantalKinderenInSpeeltuin = hotel.getAantalPersonenMogelijkInSpeeltuin();
        assertEquals(20, aantalKinderenInSpeeltuin);
    }

    @Test
    void orderSpeeltuinPlaatsTeVeel() {
        Hotel hotel = new Hotel();
        hotel.speeltuin(25);
        int aantalKinderenInSpeeltuin = hotel.getAantalPersonenMogelijkInSpeeltuin();
        assertEquals(20, aantalKinderenInSpeeltuin);
    }

}