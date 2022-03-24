package rentcompany;

public abstract class Car {
    private final int movingDistance;
    private final FuelEfficiency fuelEfficiency;

    public Car(int movingDistance, FuelEfficiency fuelEfficiency) {
        this.movingDistance = movingDistance;
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getFuelAmount(FuelCalculationStrategy calculationStrategy) {
        return calculationStrategy.calculateFuelAmount(movingDistance, fuelEfficiency.getFuelEfficiency());
    }

    public String getName() {
        return fuelEfficiency.name();
    }
}
