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
        bedroom1 = new Bedroom(1, 2, "double", 50.00);
        bedroom2 = new Bedroom(2, 1, "single", 30.50);
        bedroom3 = new Bedroom(3, 1, "single", 25.68);
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

    @Test
    public void checkInGuestBedroom(){
        hotel.checkInGuestBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.countGuests());
    }
    @Test
    public void checkInGuestConferenceRoom(){
        hotel.checkInGuestConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, conferenceRoom1.countGuests());
    }
    @Test
    public void checkInGuestDiningRoom(){
        hotel.checkInGuestDiningRoom(guest1, diningRoom1);
        assertEquals(1, diningRoom1.countGuests());
    }

    @Test
    public void checkOutGuestBedroom(){
        hotel.checkInGuestBedroom(guest1, bedroom1);
        hotel.checkInGuestBedroom(guest1, bedroom1);
        hotel.checkOutGuestBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.countGuests());
    }

    @Test
    public void checkOutConferenceRoom(){
        hotel.checkInGuestConferenceRoom(guest1, conferenceRoom1);
        hotel.checkInGuestConferenceRoom(guest1, conferenceRoom1);
        hotel.checkOutGuestConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, conferenceRoom1.countGuests());
    }

    @Test
    public void checkOutDiningRoom(){
        hotel.checkInGuestDiningRoom(guest1, diningRoom1);
        hotel.checkInGuestDiningRoom(guest1, diningRoom1);
        hotel.checkOutGuestDiningRoom(guest1, diningRoom1);
        assertEquals(1, diningRoom1.countGuests());
    }

    @Test
    public void bookBedroom(){
        hotel.bookBedroom(3, bedroom1, guest1);
        assertEquals(1, bedroom1.countGuests());
    }






}
