package coordinatecalculator.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    @DisplayName("좌표의 생성과 동치성 테스트")
    void create() {
        Point point = new Point(1, 3);
        Assertions.assertThat(point).isEqualTo(new Point(1, 3));
    }

    @Test
    @DisplayName("좌표값 범위가 넘어가면 예외 발생")
    void create_fail() {
        Assertions.assertThatThrownBy(() -> new Point(-1, 0))
                .isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> new Point(0, -1))
                .isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> new Point(0, 25))
                .isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> new Point(25, 0))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
