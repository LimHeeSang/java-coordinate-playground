package rentcompany;

public enum FuelEfficiency {
    SONATA(10), AVANTE(15), K5(13);
    private final int distance;

    FuelEfficiency(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
