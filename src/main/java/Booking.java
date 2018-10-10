public class Booking {
    private Bedroom bedroom;
    private int nights;

    Booking(Bedroom bedroom, int nights){
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public double bill() {
        return nights * bedroom.getRate();
    }
}
