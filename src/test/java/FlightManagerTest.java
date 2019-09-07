import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.CONCORDE);
        flight = new Flight(106, "GLA", "EDI", "10:00AM", plane);
        passenger1 = new Passenger("Sue Smith", 2);
        passenger2 = new Passenger("Bill Bloggs", 4);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canReturnBaggageAllowance(){
        assertEquals(1500, this.flightManager.returnTotalBaggageAllowance());
    }

    @Test
    public void canReturrnAverageBaggageWeight(){
        assertEquals(15, this.flightManager.returnAverageBaggageWeight());
    }

    @Test
    public void canReturnTotalLuggageWeight(){
        this.flight.addPassenger(passenger1);
        this.flight.addPassenger(passenger2);
        assertEquals(90, this.flightManager.returnTotalLuggageWeight());
    }

    @Test
    public void canReturnLuggageAllowanceLeft(){
        this.flight.addPassenger(passenger1);
        this.flight.addPassenger(passenger2);
        assertEquals(1410, this.flightManager.returnLuggageAllowanceLeft());
    }

}
