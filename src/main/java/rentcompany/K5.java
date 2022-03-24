package rentcompany;

public class K5 {
    private static final int FUEL_EFFICIENCY = 13;
    private final int movingDistance;

    public K5(int movingDistance) {
        this.movingDistance = movingDistance;
    }

    public double getFuelAmount() {
        return movingDistance / FUEL_EFFICIENCY;
    }
}
