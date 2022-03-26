package coordinatecalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void create_fail() {
        Assertions.assertThatThrownBy(() ->
                new Rectangle(
                        new CoordinatePair(9, 10),
                        new CoordinatePair(22, 10),
                        new CoordinatePair(22, 18),
                        new CoordinatePair(10, 18)
                )
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("직사각형이 아닙니다.");
    }

    @Test
    void different_xposition() {
        Assertions.assertThatThrownBy(() ->
                new Rectangle(
                        new CoordinatePair(10, 10),
                        new CoordinatePair(22, 10),
                        new CoordinatePair(12, 18),
                        new CoordinatePair(10, 18)
                )
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("직사각형이 아닙니다.");
    }

    @Test
    void different_yposition() {
        Assertions.assertThatThrownBy(() ->
                new Rectangle(
                        new CoordinatePair(10, 9),
                        new CoordinatePair(22, 10),
                        new CoordinatePair(22, 18),
                        new CoordinatePair(10, 18)
                )
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("직사각형이 아닙니다.");
    }

    @Test
    void calculate_area() {
        Rectangle rectangle = new Rectangle(
                new CoordinatePair(10, 10),
                new CoordinatePair(22, 10),
                new CoordinatePair(22, 18),
                new CoordinatePair(10, 18)
        );
        Assertions.assertThat(rectangle.calculateArea()).isEqualTo(96);
    }
}