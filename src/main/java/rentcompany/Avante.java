package rentcompany;

public class Avante {
    private static final int FUEL_EFFICIENCY = 15;
    private final int movingDistance;

    public Avante(int movingDistance) {
        this.movingDistance = movingDistance;
    }

    public double getFuelAmount() {
        return movingDistance / FUEL_EFFICIENCY;
    }
}
