import java.util.ArrayList;

public class Flight {

    private int flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Plane plane;
    private ArrayList<Passenger> passengers;

    public Flight(int flightnumber, String destination, String departureAirport, String departureTime, Plane plane){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public int addPassenger(Passenger passenger) {
            this.passengers.add(passenger);
            return this.passengers.size();
    }

    public int getCapacityMinusPassengers() {
        return (this.plane.getCapacityFromEnum() - this.passengers.size());
    }
}

