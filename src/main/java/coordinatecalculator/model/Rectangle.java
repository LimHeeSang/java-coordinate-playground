package coordinatecalculator.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Rectangle {
    public static final String ERROR_VALID_RECTANGLE = "직사각형 모양이 아닙니다.";
    public static final int NUM_OF_COORDINATE_CORRECT_VALUES = 2;
    private final List<Point> points;

    public Rectangle(List<Point> points) {
        validateIsRectangle(points);
        this.points = points;
    }

    private void validateIsRectangle(List<Point> points) {
        Set<Integer> xValuesOfPoints = convertToXValues(points);
        Set<Integer> yValuesOfPoints = convertToYValues(points);

        if (hasNotToPoints(xValuesOfPoints) || hasNotToPoints(yValuesOfPoints)) {
            throw new IllegalArgumentException(ERROR_VALID_RECTANGLE);
        }
    }

    private boolean hasNotToPoints(Set<Integer> valueOfPoints) {
        return valueOfPoints.size() != NUM_OF_COORDINATE_CORRECT_VALUES;
    }

    private Set<Integer> convertToYValues(List<Point> points) {
        return convertToUniqueValues(points, Point::getY);
    }

    private Set<Integer> convertToXValues(List<Point> points) {
        return convertToUniqueValues(points, Point::getX);
    }

    private Set<Integer> convertToUniqueValues(List<Point> points, Function<Point, Integer> function) {
        return points.stream()
                .map(function)
                .collect(Collectors.toSet());
    }

    public double calculateArea() {
        int width = calculateDistance(convertToXValues(points));
        int height = calculateDistance(convertToYValues(points));
        return (width * height);
    }

    private int calculateDistance(Set<Integer> valueOfPoints) {
        List<Integer> values = new ArrayList<>(valueOfPoints);
        return Math.abs(values.get(0) - values.get(1));
    }
}
