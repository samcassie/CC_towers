import java.util.ArrayList;

public class DiningRoom {

    private String name;
    ArrayList<Guest> guests;

    public DiningRoom(String name) {
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }

    public int guestCount() {
        return guests.size();
    }

    public String getName() {
        return name;
    }

    public void addGuest(Guest guest){
        guests.add(guest);
    }


}
