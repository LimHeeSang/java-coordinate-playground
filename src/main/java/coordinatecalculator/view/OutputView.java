package coordinatecalculator.view;

import coordinatecalculator.model.Point;

import java.util.List;

public class OutputView {
    public static final String FOUR_BLANK = "    ";
    public static final String ORIGIN = "+";
    public static final String HORIZONTAL_AXIS = "----";
    public static final String VERTICAL_AXIS = "|";
    public static final String MARK_OF_POINT = ".";

    public static void printCoordinateGraph(List<Point> points) {
        printVertical(points);
        printHorizontal();
    }

    private static void printHorizontal() {
        System.out.print(FOUR_BLANK + ORIGIN);
        for (int x = Point.MIN_POSITION; x <= Point.MAX_POSITION; x++) {
            System.out.print(HORIZONTAL_AXIS);
        }
        printEmptyLine();

        printHorizontalNumbers();
    }

    private static void printEmptyLine() {
        System.out.println();
    }

    private static void printHorizontalNumbers() {
        for (int x = Point.MIN_POSITION; x <= Point.MAX_POSITION; x++) {
            printAxisNumber(x);
        }
        printEmptyLine();
        printEmptyLine();
    }

    private static void printVertical(List<Point> points) {
        for (int y = Point.MAX_POSITION; y >= Point.MIN_POSITION; y--) {
            printAxisNumber(y);
            System.out.print(VERTICAL_AXIS);

            printPoints(points, y);
            printEmptyLine();
        }
    }

    private static void printPoints(List<Point> points, int y) {
        for (int x = Point.MIN_POSITION; x <= Point.MAX_POSITION; x++) {
            if (hasPoint(points, x, y)) {
                System.out.print(String.format("%4s", MARK_OF_POINT));
                continue;
            }
            System.out.print(FOUR_BLANK);
        }
    }

    private static boolean hasPoint(List<Point> points, int x, int y) {
        return points.contains(new Point(x, y));
    }

    private static void printAxisNumber(int index) {
        if (index % 2 == 0) {
            System.out.print(String.format("%4d", index));
            return;
        }
        System.out.print(FOUR_BLANK);
    }

    public static void printAreaInfo(String areaInfo) {
        System.out.println(areaInfo);
    }
}