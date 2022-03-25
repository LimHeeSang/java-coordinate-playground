package coordinatecalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CoordinatePairTest {
    @Test
    @DisplayName("0~24 범위를 벗어날 경우 예외 발생")
    void create() {
        Assertions.assertThatThrownBy(() -> new CoordinatePair(2, 25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("좌표 값은 0 ~ 24 사이여야 합니다.");
    }
}
