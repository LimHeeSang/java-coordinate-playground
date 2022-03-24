package rentcompany;

public enum FuelEfficiency {
    SONATA(10), AVANTE(15), K5(13);
    private final int fuelEfficiency;

    FuelEfficiency(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getFuelEfficiency() {
        return fuelEfficiency;
    }
}
