import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 1, "single", 25.56);
        guest1 = new Guest("Foteini", 1);
        guest2 = new Guest("Alvaro", 2);
    }

    @Test
    public void addGuest(){
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.countGuests());

    }

    @Test
    public void addGuestFull(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void removeGuest(){
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.countGuests());

    }
    @Test
    public void removeGuestRoomEmpty(){
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void isEmpty(){
        assertEquals(true, bedroom.isEmpty());
    }



}
