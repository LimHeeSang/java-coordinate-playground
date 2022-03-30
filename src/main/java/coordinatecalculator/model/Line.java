package coordinatecalculator.model;

import java.util.List;

public class Line extends AbstractShape{

    public static final String OUTPUT_AREA_OF_LINE = "두 점 사이 거리는 ";

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double calculateArea() {
        return getPoints().get(0).calculateLength(getPoints().get(1));
    }

    @Override
    public String getAreaInfo() {
        return OUTPUT_AREA_OF_LINE + calculateArea();
    }
}