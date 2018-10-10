import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DiningRoomTest {
    DiningRoom room;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        room = new DiningRoom("Gimme food", 1);
        guest1 = new Guest("Foteini", 1);
        guest2 = new Guest("Alvaro", 2);
    }

    @Test
    public void addGuest(){
        room.addGuest(guest1);
        assertEquals(1, room.countGuests());

    }

    @Test
    public void addGuestFull(){
        room.addGuest(guest1);
        room.addGuest(guest2);
        assertEquals(1, room.countGuests());
    }
}
