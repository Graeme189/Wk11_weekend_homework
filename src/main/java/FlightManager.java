public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int returnTotalBaggageAllowance() {
        Plane plane = this.flight.getPlane();
        return ((plane.getWeightFromEnum() / 2));
    }

    public int returnAverageBaggageWeight() {
        Plane plane = this.flight.getPlane();
        return ((plane.getWeightFromEnum() / 2) / plane.getCapacityFromEnum());
    }

    public int returnTotalLuggageWeight() {
        int totalLuggageWeight = 0;
        for (Passenger passenger : this.flight.getPassengers()) {
            totalLuggageWeight += (returnAverageBaggageWeight() * passenger.getLuggage());
        }
        return totalLuggageWeight;
    }

    public int returnLuggageAllowanceLeft() {
        return (returnTotalBaggageAllowance() - returnTotalLuggageWeight());
    }
}
