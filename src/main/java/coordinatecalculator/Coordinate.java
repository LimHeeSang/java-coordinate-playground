package coordinatecalculator;

import java.util.Objects;

public class Coordinate {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 24;
    private final int coordinate;

    public Coordinate(int coordinate) {
        validate(coordinate);
        this.coordinate = coordinate;
    }

    private void validate(int x) {
        if (x < MIN_VALUE || x > MAX_VALUE) {
            throw new IllegalArgumentException("좌표 값은 0 ~ 24 사이여야 합니다.");
        }
    }

    public int subAndSquare(Coordinate coordinate) {
        return (int) Math.pow(this.coordinate - coordinate.coordinate, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return coordinate == that.coordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate);
    }

    public int sub(Coordinate coordinate) {
        return this.coordinate - coordinate.coordinate;
    }
}
