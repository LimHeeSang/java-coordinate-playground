package coordinatecalculator.domain;

import java.util.List;

public class Rectangle extends Shape{
    private final CoordinatePair leftDown;
    private final CoordinatePair rightDown;
    private final CoordinatePair rightUp;
    private final CoordinatePair leftUp;

    public Rectangle(CoordinatePair leftDown, CoordinatePair rightDown, CoordinatePair rightUp, CoordinatePair leftUp) {
        validateIsRectangle(leftDown, rightDown, rightUp, leftUp);
        this.leftDown = leftDown;
        this.rightDown = rightDown;
        this.rightUp = rightUp;
        this.leftUp = leftUp;
    }

    public Rectangle(List<List<Integer>> coordinates) {
        CoordinatePair leftDown = mapListToCoordinatePair(coordinates.get(0));
        CoordinatePair rightDown = mapListToCoordinatePair(coordinates.get(1));
        CoordinatePair rightUp = mapListToCoordinatePair(coordinates.get(2));
        CoordinatePair leftUp = mapListToCoordinatePair(coordinates.get(3));

        this.leftDown = leftDown;
        this.rightDown = rightDown;
        this.rightUp = rightUp;
        this.leftUp = leftUp;
    }

    private void validateIsRectangle(CoordinatePair leftDown, CoordinatePair rightDown, CoordinatePair rightUp, CoordinatePair leftUp) {
        if (!leftUp.isEqualXPosition(leftDown)
                || !rightUp.isEqualXPosition(rightDown)
                || !leftUp.isEqualYPosition(rightUp)
                || !leftDown.isEqualYPosition(rightDown)) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
    }

    @Override
    public double calculateArea() {
        int width = rightDown.subXPosition(leftDown);
        int height = rightUp.subYPosition(rightDown);
        return (width * height);
    }
}
