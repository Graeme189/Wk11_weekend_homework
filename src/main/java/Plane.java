public class Plane {

    private PlaneType type;
    private int weight;

    public Plane(PlaneType type) {
        this.type = type;
//        this.weight = weight;
    }

    public PlaneType getType() {
        return this.type;
    }

    public int getCapacityFromEnum() {
        return this.type.getCapacity();
    }
}

