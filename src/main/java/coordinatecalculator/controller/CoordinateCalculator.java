package coordinatecalculator.controller;

import coordinatecalculator.model.Point;
import coordinatecalculator.model.Shape;
import coordinatecalculator.model.ShapeFactory;
import coordinatecalculator.view.InputView;
import coordinatecalculator.view.OutputView;

import java.util.List;

public class CoordinateCalculator {
    public void run() {
        Shape shape = inputCoordinate();

        List<Point> getPoints = shape.getPoints();
        String areaInfo = shape.getAreaInfo();

        OutputView.printCoordinateGraph(getPoints);
        OutputView.printAreaInfo(areaInfo);
    }

    private Shape inputCoordinate() {
        try {
            List<Point> points = InputView.inputCoordinates();
            return ShapeFactory.create(points);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            return inputCoordinate();
        }
    }
}
