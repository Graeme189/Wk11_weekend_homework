public enum PlaneType {
    CONCORDE(3000, 100),
    BOEING747(5000, 300),
    SPITFIRE(1000, 2);

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
