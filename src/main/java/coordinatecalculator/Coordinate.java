package coordinatecalculator;

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
}
