package coordinatecalculator.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineTest {
    @Test
    void calculateLength() {
        Line line = new Line(new Point(10, 10), new Point(14, 15));
        double length = line.calculateLength();
        Assertions.assertThat(length).isEqualTo(6.403124D, Assertions.offset(0.00099));
    }
}