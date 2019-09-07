public class Plane {

    private PlaneType type;
    private int weight;
    private int capacity;

    public Plane(PlaneType type) {
        this.type = type;
        this.weight = type.getWeight();
        this.capacity = type.getCapacity();
    }

    public PlaneType getType() {
        return this.type;
    }

    public int getCapacityFromEnum() {
        return this.type.getCapacity();
    }
    public int getWeightFromEnum() {
        return this.type.getWeight();
    }
}

