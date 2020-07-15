import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;
    private String name;

    public ConferenceRoom(int capacity, String name) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.name = name;
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
