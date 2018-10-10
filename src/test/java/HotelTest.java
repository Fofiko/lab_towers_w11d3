import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    DiningRoom diningRoom1;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;


    @Before
    public void before() {
        hotel = new Hotel();
        bedroom1 = new Bedroom(1, 2, "double");
        bedroom2 = new Bedroom(1, 1, "single");
        bedroom3 = new Bedroom(1, 1, "single");
        conferenceRoom1 = new ConferenceRoom(1, 3);
        diningRoom1 = new DiningRoom("McDonalds", 4);
        guest1 = new Guest("Foteini", 1);
        guest2 = new Guest("Alvaro", 2);
        guest3 = new Guest("Sandy", 3);
        guest4 = new Guest("Colin", 4);

        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addDiningRoom(diningRoom1);
    }


    @Test
    public void addBedroom(){
        hotel.addBedroom(bedroom3);
        assertEquals(3, hotel.countBedrooms());

    }

    @Test
    public void addConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(2, hotel.countConferenceRooms());
    }

    @Test
    public void addDiningRoom(){
        hotel.addDiningRoom(diningRoom1);
        assertEquals(2, hotel.countDiningRooms());
    }




}
