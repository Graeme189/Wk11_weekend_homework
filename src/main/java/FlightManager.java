public class FlightManager {

    private Flight flight;
    private Plane plane;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int returnTotalBaggageAllowance() {
        Plane plane = this.flight.getPlane();
        return (plane.getWeightFromEnum() / 2);
    }
}
