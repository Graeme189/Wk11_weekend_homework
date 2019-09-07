import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger1;


    @Before
    public void setUp(){
        plane = new Plane(PlaneType.CONCORDE);
        flight = new Flight(106, "GLA", "EDI", "10:00AM", plane);
        passenger1 = new Passenger("Bill Bloggs", 1);
    }

    @Test
    public void flightHasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void flightHasCapacity(){
        assertEquals(100, this.plane.getCapacityFromEnum());
    }

    @Test
    public void canAddPassengerToFlight(){
        assertEquals(1, flight.addPassenger(passenger1));
    }
}
