package coordinatecalculator.controller;

import coordinatecalculator.domain.*;
import coordinatecalculator.ui.InputView;
import coordinatecalculator.ui.ResultView;

import java.util.List;

public class CoordinateCalculator {
    public static void main(String[] args) {
        List<List<Integer>> coordinates = InputView.inputCoordinates();
        Shape shape = new Shape() {
            @Override
            public double calculateArea() {
                return 0;
            }
        };

        ShapeName shapeName = Shape.isShapeKind(coordinates);
        if (Shape.isShapeKind(coordinates) == ShapeName.LINE) {
            shape = new Line(coordinates);
        }
        if (Shape.isShapeKind(coordinates) == ShapeName.TRIANGLE) {
            shape = new Triangle(coordinates);
        }
        if (Shape.isShapeKind(coordinates) == ShapeName.RECTANGLE) {
            shape = new Rectangle(coordinates);
        }

        ResultView.printResult(shapeName, shape.calculateArea());
    }
}
