package coordinatecalculator.domain;

import coordinatecalculator.domain.CoordinatePair;
import coordinatecalculator.domain.Triangle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void calculate_area() {
        Triangle triangle = new Triangle(
                new CoordinatePair(10, 10),
                new CoordinatePair(14, 15),
                new CoordinatePair(20, 8)
        );
        Assertions.assertThat(triangle.calculateArea()).isEqualTo(29.0D);
    }
}
