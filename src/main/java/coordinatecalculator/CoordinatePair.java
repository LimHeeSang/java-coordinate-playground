package coordinatecalculator;

public class CoordinatePair {
    private final Coordinate coordinateX;
    private final Coordinate coordinateY;

    public CoordinatePair(int x, int y) {
        this.coordinateX = new Coordinate(x);
        this.coordinateY = new Coordinate(y);
    }

    public Double calculateLineLength(CoordinatePair coordinatePair) {
        int subX = coordinateX.subAndSquare(coordinatePair.coordinateX);
        int subY = coordinateY.subAndSquare(coordinatePair.coordinateY);

        return Math.sqrt(subX + subY);
    }

}
