package coordinatecalculator.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ShapeFactory {
    public static final String ERROR_POINTS_COUNT = "Point 개수가 유효하지 않습니다.";
    public static final int NUM_OF_POINTS_OF_LINE = 2;
    public static final int NUM_OF_POINTS_OF_TRIANGLE = 3;
    public static final int NUM_OF_POINTS_OF_RECTANGLE = 4;
    private static final Map<Integer, Function<List<Point>, Shape>> factory = new HashMap<>();

    static {
        factory.put(NUM_OF_POINTS_OF_LINE, Line::new);
        factory.put(NUM_OF_POINTS_OF_TRIANGLE, Triangle::new);
        factory.put(NUM_OF_POINTS_OF_RECTANGLE, Rectangle::new);
    }

    public static Shape create(List<Point> points) {
        if (points == null) {
            throw new IllegalArgumentException(AbstractShape.ERROR_SHAPE_NULL);
        }
        if (isInvalidatePointsCount(points)) {
            throw new IllegalArgumentException(ERROR_POINTS_COUNT);
        }

        return factory.get(points.size()).apply(points);
    }

    private static boolean isInvalidatePointsCount(List<Point> points) {
        return points.size() < NUM_OF_POINTS_OF_LINE || points.size() > NUM_OF_POINTS_OF_RECTANGLE;
    }
}