package rentcompany;

public class FuelCalculationStrategyImpl implements FuelCalculationStrategy {
    @Override
    public int calculateFuelAmount(int distance, int fuelEfficiency) {
        return (distance / fuelEfficiency);
    }
}
