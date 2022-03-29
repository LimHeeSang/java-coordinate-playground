package coordinatecalculator.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RectangleTest {
    @Test
    void create() {
        List<Point> testPoints = Arrays.asList(
                new Point(10, 10),
                new Point(23, 10),
                new Point(22, 18),
                new Point(10, 18)
        );
        Assertions.assertThatThrownBy(() -> new Rectangle(testPoints))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void calculate_area() {
        List<Point> testPoints = Arrays.asList(
                new Point(10, 10),
                new Point(22, 10),
                new Point(22, 18),
                new Point(10, 18)
        );
        Rectangle rectangle = new Rectangle(testPoints);
        double area = rectangle.calculateArea();
        Assertions.assertThat(area).isEqualTo(96D);
    }
}
