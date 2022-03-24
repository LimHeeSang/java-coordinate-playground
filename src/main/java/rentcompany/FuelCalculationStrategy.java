package rentcompany;

@FunctionalInterface
public interface FuelCalculationStrategy {
    int calculateFuelAmount(int distance, int fuelEfficiency);
}
