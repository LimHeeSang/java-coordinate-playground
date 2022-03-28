package coordinatecalculator.model;

import java.util.List;

public class Line {
    private final List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    public double calculateLength() {
        return points.get(0).calculateLength(points.get(1));
    }
}