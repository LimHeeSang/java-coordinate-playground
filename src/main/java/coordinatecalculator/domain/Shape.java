package coordinatecalculator.domain;

import java.util.List;

public abstract class Shape {
    public abstract double calculateArea();

    public static ShapeName isShapeKind(List<List<Integer>> coordinates) {
        if (coordinates.size() == 2) {
            return ShapeName.LINE;
        }
        if (coordinates.size() == 3) {
            return ShapeName.TRIANGLE;
        }
        return ShapeName.RECTANGLE;
    }

    protected CoordinatePair mapListToCoordinatePair(List<Integer> coordinate) {
        return new CoordinatePair(coordinate.get(0), coordinate.get(1));
    }
}
