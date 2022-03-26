package coordinatecalculator.domain;

import coordinatecalculator.domain.CoordinatePair;
import coordinatecalculator.domain.Line;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CoordinatePairTest {
    @Test
    @DisplayName("0~24 범위를 벗어날 경우 예외 발생")
    void create() {
        assertThatThrownBy(() -> new CoordinatePair(-1, 25))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("좌표 값은 0 ~ 24 사이여야 합니다.");
    }

    @Test
    @DisplayName("입력 좌표의 선의 길이를 계산")
    void calculate() {
        CoordinatePair coordinatePair1 = new CoordinatePair(10, 10);
        CoordinatePair coordinatePair2= new CoordinatePair(14, 15);
        Double actual = coordinatePair1.calculateLineLength(coordinatePair2);

        assertThat(actual).isEqualTo(6.403124, offset(0.000001));
    }

    @Test
    @DisplayName("입력 좌표의 선을 만들어서 길이 계산")
    void calculate2() {
        Line line = new Line(new CoordinatePair(10, 10), new CoordinatePair(14, 15));
        Double actual = line.calculateLineLength();

        assertThat(actual).isEqualTo(6.403124, offset(0.000001));
    }
}