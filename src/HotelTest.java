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
    void orderKleineKamerAantalPersonen() {
        Hotel hotel = new Hotel();
        hotel.orderKleineKamer(2);
        int aantalKleineKamers =  hotel.getAantalKleineKamers();
        assertEquals(8,aantalKleineKamers);
        int aantalPersonenNogOver=  hotel.getAantalPersonen();
        assertEquals(96,aantalPersonenNogOver);
    }

}