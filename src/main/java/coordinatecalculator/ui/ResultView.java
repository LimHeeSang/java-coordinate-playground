package coordinatecalculator.ui;

import coordinatecalculator.domain.ShapeName;

public class ResultView {
    private static void printLine(Double result) {
        System.out.println("두 점 사이 거리는" + result);
    }

    private static void printTriangle(Double result) {
        System.out.println("삼각형 넓이는" + result);
    }

    private static void printRectangle(double result) {
        System.out.println("사각형 넓이는" + result);
    }

    public static void printResult(ShapeName shapeName, double result) {
        if (shapeName == ShapeName.LINE) {
            printLine(result);
        }
        if (shapeName == ShapeName.TRIANGLE) {
            printTriangle(result);
        }
        if (shapeName == ShapeName.RECTANGLE) {
            printRectangle(result);
        }
    }
}