import java.util.ArrayList;

public class Flight {

    private int flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Plane plane;
    private ArrayList<Passenger> passengers;

    public Flight(int flightnumber, String destination, String departureAirport, String departureTime, Plane PlaneType){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.plane = PlaneType;
        this.passengers = new ArrayList<Passenger>();
    }
}
