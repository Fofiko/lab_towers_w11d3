import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;


    Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public int countBedrooms() {
        return bedrooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);

    }

    public int countConferenceRooms() {
        return conferenceRooms.size();
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        diningRooms.add(diningRoom);
    }

    public int countDiningRooms() {
        return diningRooms.size();
    }

    public boolean checkInGuestBedroom(Guest guest, Bedroom room) {
        boolean result = room.isEmpty();
        room.addGuest(guest);
        return result;
    }

    public void checkInGuestConferenceRoom(Guest guest, ConferenceRoom room) {
        room.addGuest(guest);
    }

    public void checkInGuestDiningRoom(Guest guest, DiningRoom room) {
        room.addGuest(guest);
    }

    public void checkOutGuestBedroom(Guest guest, Bedroom room) {
        room.removeGuest(guest);
    }

    public void checkOutGuestConferenceRoom(Guest guest, ConferenceRoom room) {
        room.removeGuest(guest);
    }

    public void checkOutGuestDiningRoom(Guest guest, DiningRoom room) {
        room.removeGuest(guest);
    }

    public Booking bookBedroom(int nights, Bedroom bedroom, Guest guest) {
        if (checkInGuestBedroom(guest, bedroom)) {
            return new Booking(bedroom, nights);
        }

        return null;
    }

    public ArrayList<Bedroom> vacantBedrooms() {
        ArrayList<Bedroom> result = new ArrayList<>();
        for (Bedroom room : this.bedrooms) {
            if (room.isEmpty()){
                result.add(room);
            }
        }
        return result;
    }
}
