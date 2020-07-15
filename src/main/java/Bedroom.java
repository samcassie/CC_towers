import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;
    private int nightlyRate;

    public Bedroom(int roomNumber, int capacity, String roomType, int nightlyRate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public void addGuest(Guest guest){
        if (guestCount() < capacity) {
            guests.add(guest);
        }
    }

    public int guestCount(){
        return guests.size();
    }
}
