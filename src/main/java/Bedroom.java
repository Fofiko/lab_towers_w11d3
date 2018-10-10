import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    Bedroom(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.type = type;
    }


    public void addGuest(Guest guest) {
        if (countGuests() < capacity) {
            guests.add(guest);
        }
    }

    public int countGuests() {
        return guests.size();
    }
}
