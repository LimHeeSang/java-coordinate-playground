package coordinatecalculator.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TriangleTest {
    @Test
    @DisplayName("삼각형을 만드는데 실패하는 테스트")
    void create_fail() {
        List<Point> points = Arrays.asList(
                new Point(1, 1),
                new Point(2, 2),
                new Point(3, 3)
        );
        Assertions.assertThatThrownBy(() -> new Triangle(points))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("삼각형의 넓이를 계산")
    void calculate_area() {
        List<Point> points = Arrays.asList(
                new Point(10, 10),
                new Point(14, 15),
                new Point(20, 8)
        );
        Triangle triangle = new Triangle(points);
        Assertions.assertThat(triangle.calculateArea()).isEqualTo(29D, Assertions.offset(0.00099));
    }
}
