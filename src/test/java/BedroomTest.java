import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Guest guest;
    Bedroom bedroom;

    @Before
    public void before(){
        guest = new Guest("Matthew");
        bedroom = new Bedroom(1, 2, "Double", 10);
    }

    @Test
    public void checkRoomIsEmpty(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void checkGuestsAreAdded(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.guestCount());
    }

    @Test
    public void cantAddToFullRoom(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        bedroom.addGuest(guest);
        assertEquals(2, bedroom.guestCount());
    }
}
