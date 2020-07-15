import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {


    Guest guest;
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        guest = new Guest("Matthew");
        conferenceRoom = new ConferenceRoom(5, "Meeting Room");
    }

    @Test
    public void checkRoomIsEmpty(){
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void checkGuestsAreAdded(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(2, conferenceRoom.guestCount());
    }

    @Test
    public void cantAddToFullRoom(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        conferenceRoom.addGuest(guest);
        assertEquals(5, conferenceRoom.guestCount());
    }
}
