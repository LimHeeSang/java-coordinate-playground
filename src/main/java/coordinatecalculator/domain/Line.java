package coordinatecalculator.domain;

import java.util.List;

public class Line extends Shape{
    private final CoordinatePair point1;
    private final CoordinatePair point2;

    public Line(CoordinatePair point1, CoordinatePair point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line(List<List<Integer>> coordinates) {
        CoordinatePair point1 = mapListToCoordinatePair(coordinates.get(0));
        CoordinatePair point2 = mapListToCoordinatePair(coordinates.get(1));

        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public double calculateArea() {
        return point1.calculateLineLength(point2);
    }
}
