import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    ConferenceRoom conferenceRoom1;
    Guest guest;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    DiningRoom diningRoom1;
    DiningRoom diningRoom2;

    @Before
    public void before(){
        guest = new Guest("Sam");
        bedroom1 = new Bedroom(1, 2, "double", 20);
        bedroom2 = new Bedroom(2, 1, "single", 10);
        bedroom3 = new Bedroom(2, 1, "single", 10);
        bedroom4 = new Bedroom(2, 1, "single", 10);
        conferenceRoom1 = new ConferenceRoom(5, "Meeting Room");
        diningRoom1 = new DiningRoom("Dining Room");
        diningRoom2 = new DiningRoom("Another Room");

        diningRoom1.addGuest(guest);
        diningRoom2.addGuest(guest);

        bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);

        conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom1);

        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void addGuestToBedroom(){
        hotel.checkInBedroom(guest, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void addGuestToConferenceRoom(){
        hotel.checkInConferenceRoom(guest, conferenceRoom1);
        hotel.checkInConferenceRoom(guest, conferenceRoom1);
        hotel.checkInConferenceRoom(guest, conferenceRoom1);
        assertEquals(3, conferenceRoom1.guestCount());
    }

    @Test
    public void canMakeBooking(){
        Booking testBooking = new Booking(bedroom1, 3);
        Booking booking = hotel.bookRoom(bedroom1, 3);
        assertEquals(booking.getClass(), testBooking.getClass());
    }

    @Test
    public void canAddDiningRoomToHotel(){
        hotel.addDiningRoom(diningRoom1);
        assertEquals(1, hotel.diningRoomCount());
    }

    @Test
    public void canAddAnotherDiningRoomToHotel(){
        hotel.addDiningRoom(diningRoom1);
        hotel.addDiningRoom(diningRoom2);
        assertEquals(2, hotel.diningRoomCount());
    }

    @Test
    public void canAddGuestToDiningRoom(){
        hotel.addGuestToDiningRoom(guest, diningRoom1);
        assertEquals(2, diningRoom1.guestCount());
    }

    @Test
    public void checkForEmptyRooms(){
        bedrooms.add(bedroom3);
        bedrooms.add(bedroom4);

        bedroom1.addGuest(guest);
        bedroom3.addGuest(guest);
        bedroom2.addGuest(guest);

        ArrayList<Bedroom> emptyRooms = hotel.checkForEmptyBedrooms();
        assertEquals(1, emptyRooms.size());
    }



}
