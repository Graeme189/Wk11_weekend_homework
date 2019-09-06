public enum PlaneType {
    CONCORDE(100),
    BOEING747(500),
    SPITFIRE(50);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
