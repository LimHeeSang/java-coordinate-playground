package coordinatecalculator.model;

import java.util.List;
import java.util.Objects;

public abstract class AbstractShape implements Shape{
    public static final String ERROR_SHAPE_NULL = "올바른 Point 값이 아닙니다.";
    private final List<Point> points;

    public AbstractShape(List<Point> points) {
        if (points == null || points.isEmpty()) {
            throw new IllegalArgumentException(ERROR_SHAPE_NULL);
        }
        this.points = points;
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractShape that = (AbstractShape) o;
        return Objects.equals(getPoints(), that.getPoints());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoints());
    }


}