package coordinatecalculator.model;

import java.util.List;

public class Triangle {
    public static final String ERROR_INVALID_TRIANGLE = "삼각형이 아닙니다.";
    private final List<Point> points;

    public Triangle(List<Point> points) {
        if (!validateIsTriangle(points)) {
            throw new IllegalArgumentException(ERROR_INVALID_TRIANGLE);
        }
        this.points = points;
    }

    private boolean validateIsTriangle(List<Point> points) {
        return points.get(0).calculateSlope(points.get(1)) != points.get(1).calculateSlope(points.get(2));
    }

    /**
     * area = s(s - a)(s - b)(s - c)
     */
    public double calculateArea() {
        Point firstPoint = points.get(0);
        Point secondPoint = points.get(1);
        Point thirdPoint = points.get(2);

        double a = firstPoint.calculateLength(secondPoint);
        double b = secondPoint.calculateLength(thirdPoint);
        double c = thirdPoint.calculateLength(firstPoint);

        return calculateS(a, b, c);
    }

    private double calculateS(double a, double b, double c) {
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
