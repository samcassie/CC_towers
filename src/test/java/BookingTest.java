import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 2, "double", 10);
        booking = new Booking(bedroom, 7);
    }

    @Test
    public void totalCost(){
        assertEquals(70, booking.totalPrice());
    }

}
