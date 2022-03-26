package coordinatecalculator;

public class Rectangle {
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

    private void validateIsRectangle(CoordinatePair leftDown, CoordinatePair rightDown, CoordinatePair rightUp, CoordinatePair leftUp) {
        if (!leftUp.isEqualXposition(leftDown)) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
        if (!rightUp.isEqualXposition(rightDown)) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
        if (!leftUp.isEqualYposition(rightUp)) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
        if (!leftDown.isEqualYposition(rightDown)) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
    }
}
