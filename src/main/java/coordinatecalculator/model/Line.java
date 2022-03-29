package coordinatecalculator.model;

import java.util.List;

public class Line extends AbstractShape{
    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double calculateArea() {
        return getPoints().get(0).calculateLength(getPoints().get(1));
    }
}