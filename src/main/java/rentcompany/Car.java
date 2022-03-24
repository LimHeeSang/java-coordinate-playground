package rentcompany;

public abstract class Car {
    private final int movingDistance;
    private final FuelEfficiency fuelEfficiency;

    public Car(int movingDistance, FuelEfficiency fuelEfficiency) {
        this.movingDistance = movingDistance;
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getFuelAmount() {
        return movingDistance / fuelEfficiency.getDistance();
    }

    public String getName() {
        return fuelEfficiency.name();
    }
}
