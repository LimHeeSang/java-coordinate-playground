package rentcompany;

public class Sonata {
    private static final int FUEL_EFFICIENCY = 10;
    private final int movingDistance;

    public Sonata(int movingDistance) {
        this.movingDistance = movingDistance;
    }

    public double getFuelAmount() {
        return movingDistance / FUEL_EFFICIENCY;
    }
}
