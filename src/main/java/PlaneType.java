public enum PlaneType {
    CONCORDE(3000, 1000),
    BOEING747(5000, 3000),
    SPITFIRE(1000, 500);

    private final int weight;
    private final int capacity;

    PlaneType(int weight, int capacity) {
        this.weight = weight;
        this.capacity = capacity;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
