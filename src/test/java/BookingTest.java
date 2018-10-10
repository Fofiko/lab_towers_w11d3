import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Guest guest;
    Bedroom room;

    @Before
    public void before() {
        guest = new Guest("Alvaro", 1);
        room = new Bedroom(1, 1, "single", 25.50);
        booking =  new Booking(room, 2);
    }

    @Test
    public void Bill() {
        assertEquals(51.00, booking.bill(), 0.01);
    }
}
