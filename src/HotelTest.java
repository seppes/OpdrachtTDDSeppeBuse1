import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void orderKleineKamer() {
        Hotel hotel = new Hotel();
        hotel.orderKleineKamer(2);
        int aantalKleineKamers =  hotel.getAantalKleineKamers();
        assertEquals(8,aantalKleineKamers);
    }

    @Test
    void orderKleineKamerNegatiefAantalKamers() {
        Hotel hotel = new Hotel();
        hotel.orderKleineKamer(-2);
        int aantalKleineKamers =  hotel.getAantalKleineKamers();
        assertEquals(10,aantalKleineKamers);
    }

    @Test
    void orderKleineKamerTeVeelAantalKamers() {
        Hotel hotel = new Hotel();
        hotel.orderKleineKamer(12);
        int aantalKleineKamers =  hotel.getAantalKleineKamers();
        assertEquals(10,aantalKleineKamers);
    }

    @Test
    void orderKleineKamerAantalPersonen() {
        Hotel hotel = new Hotel();
        hotel.orderKleineKamer(2);
        int aantalPersonenNogOver=  hotel.getAantalPersonen();
        assertEquals(96,aantalPersonenNogOver);
    }

    @Test
    void orderKleineKamerTeVeelAantalPersonen() {
        Hotel hotel = new Hotel();
        hotel.orderKleineKamer(60);
        int aantalPersonenNogOver=  hotel.getAantalPersonen();
        assertEquals(100,aantalPersonenNogOver);
    }

    @Test
    void orderPrijs() {
        Hotel hotel = new Hotel();
        hotel.orderKleineKamer(2);
        double prijs=  hotel.getPrijs();
        assertEquals(200,prijs);
    }

    @Test
    void orderLuxe() {
        Hotel hotel = new Hotel();
        hotel.orderKleineKamer(2, "luxe");
        double prijs=  hotel.getPrijs();
        assertEquals(300,prijs);
    }

    @Test
    void orderLuxeFout() {
        Hotel hotel = new Hotel();
        hotel.orderKleineKamer(2, "foute input");
        double prijs=  hotel.getPrijs();
        assertEquals(200,prijs);
    }
}