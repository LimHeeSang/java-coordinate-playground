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
        if (!leftUp.isEqualXPosition(leftDown)
                || !rightUp.isEqualXPosition(rightDown)
                || !leftUp.isEqualYPosition(rightUp)
                || !leftDown.isEqualYPosition(rightDown)) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
    }

    public int calculateArea() {
        int width = rightDown.subXPosition(leftDown);
        int height = rightUp.subYPosition(rightDown);
        return (width * height);
    }
}
