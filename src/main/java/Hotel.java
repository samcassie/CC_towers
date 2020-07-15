import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;


    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = new HashMap();
    }

    public void addDiningRoom(DiningRoom diningRoom){
        diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public int diningRoomCount(){
        return diningRooms.size();
    }

    public void checkInBedroom(Guest guest, Bedroom bedroom){
        if (bedroom.guestCount() == 0) {
            bedroom.addGuest(guest);
        }
    }

    public void checkInConferenceRoom(Guest guest, ConferenceRoom conferenceRoom){
        conferenceRoom.addGuest(guest);
    }

    public void addGuestToDiningRoom(Guest guest, DiningRoom diningRoom){
        diningRoom.addGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nights){
        Booking booking = new Booking(bedroom, nights);
        return booking;
    }

    public ArrayList<Bedroom> checkForEmptyBedrooms(){
        ArrayList<Bedroom> emptyRooms = new ArrayList();
        for (int i = 0; i < bedrooms.size(); i++){
            if ( bedrooms.get(i).guestCount() == 0 ){
                emptyRooms.add(bedrooms.get(i));
            }
        }
        return emptyRooms;
    }

}
