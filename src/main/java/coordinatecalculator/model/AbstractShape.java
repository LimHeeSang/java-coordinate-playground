package coordinatecalculator.model;

import java.util.List;

public abstract class AbstractShape {
    private final List<Point> points;

    public AbstractShape(List<Point> points) {
        this.points = points;
    }

    public abstract double calculateArea();

    protected List<Point> getPoints() {
        return points;
    }
}
