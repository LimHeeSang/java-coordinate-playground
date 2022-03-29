package coordinatecalculator.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LineTest {
    @Test
    void calculateLength() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(14, 15));
        Line line = new Line(points);
        double length = line.calculateArea();
        Assertions.assertThat(length).isEqualTo(6.403124D, Assertions.offset(0.00099));
    }
}