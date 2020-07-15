public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;

    public Booking(Bedroom bedroom, int numberOfNights) {
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }

    public int totalPrice(){
        int total = (this.bedroom.getNightlyRate() * this.numberOfNights);
        return total;
    }

}
