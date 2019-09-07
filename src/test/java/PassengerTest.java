import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void setUp() {
        passenger = new Passenger("Bill Bloggs", 1);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Bill Bloggs", passenger.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(1, passenger.getLuggage());
    }

}

