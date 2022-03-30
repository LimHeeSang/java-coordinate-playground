package coordinatecalculator.model;

import java.util.List;

public interface Shape {
    List<Point> getPoints();

    double calculateArea();

    String getAreaInfo();
}