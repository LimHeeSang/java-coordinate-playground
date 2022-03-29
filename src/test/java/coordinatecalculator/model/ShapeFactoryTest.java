package coordinatecalculator.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ShapeFactoryTest {
    @Test
    void Line_create() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(14, 15));
        Shape actual = ShapeFactory.create(points);

        Line expect = new Line(points);
        Assertions.assertThat(actual).isEqualTo(expect);
    }

    @Test
    void triangle_create() {
        List<Point> points = Arrays.asList(
                new Point(10, 10),
                new Point(14, 15),
                new Point(20, 8)
        );
        Shape actual = ShapeFactory.create(points);

        Triangle expect = new Triangle(points);
        Assertions.assertThat(actual).isEqualTo(expect);
    }

    @Test
    void rectangle_create() {
        List<Point> points = Arrays.asList(
                new Point(10, 10),
                new Point(22, 10),
                new Point(22, 18),
                new Point(10, 18)
        );
        Shape actual = ShapeFactory.create(points);

        Rectangle expect = new Rectangle(points);
        Assertions.assertThat(actual).isEqualTo(expect);
    }
}
