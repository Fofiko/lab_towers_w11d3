import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private double rate;

    Bedroom(int roomNumber, int capacity, String type, double rate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.type = type;
        this.rate = rate;
    }


    public void addGuest(Guest guest) {
        if (countGuests() < capacity) {
            guests.add(guest);
        }
    }

    public int countGuests() {
        return guests.size();
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }

    public double getRate() {
        return this.rate;
    }
}
