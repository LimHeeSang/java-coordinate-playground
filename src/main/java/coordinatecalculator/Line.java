package coordinatecalculator;

public class Line {
    private final CoordinatePair point1;
    private final CoordinatePair point2;

    public Line(CoordinatePair point1, CoordinatePair point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Double calculateLineLength() {
        return point1.calculateLineLength(point2);
    }
}
