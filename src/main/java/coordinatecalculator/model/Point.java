package coordinatecalculator.model;

import java.util.Objects;

public class Point {
    public static final int MIN_POSITION = 0;
    public static final int MAX_POSITION = 24;
    public static final String ERROR_OUT_OF_POSITION = "좌표의 범위는" + MIN_POSITION + "과 " + MAX_POSITION + "사이여야합니다.";
    private final int x;
    private final int y;

    public Point(int x, int y) {
        validateRange(x, y);
        this.x = x;
        this.y = y;
    }

    private void validateRange(int x, int y) {
        if (validateXPosition(x) || validateYPosition(y)) {
            throw new IllegalArgumentException(ERROR_OUT_OF_POSITION);
        }
    }

    private boolean validateYPosition(int y) {
        return y < MIN_POSITION || y > MAX_POSITION;
    }

    private boolean validateXPosition(int x) {
        return x < MIN_POSITION || x > MAX_POSITION;
    }

    public double calculateLength(Point comparePoint) {
        int subX = subXPosition(comparePoint.x);
        int subY = subYPosition(comparePoint.y);

        return Math.sqrt(Math.pow(subX, 2) + Math.pow(subY, 2));
    }

    private int subYPosition(int y) {
        return this.y - y;
    }

    private int subXPosition(int x) {
        return this.x - x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double calculateSlope(Point comparePoint) {
        if (this.x == comparePoint.x) {
            return 0;
        }
        return Math.abs((double) (this.y - comparePoint.y) / (this.x - comparePoint.x));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return getX() == point.getX() && getY() == point.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}