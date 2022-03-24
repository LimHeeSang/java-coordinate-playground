package rentcompany;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    @DisplayName("sonata 주입 연료량 계산")
    void sonata_fuel_amount() {
        Sonata sonata = new Sonata(150);
        Assertions.assertThat(sonata.getFuelAmount()).isEqualTo(15);
    }

    @Test
    @DisplayName("avante 주입 연료량 계산")
    void avante_fuel_amount() {
        Avante avante = new Avante(150);
        Assertions.assertThat(avante.getFuelAmount()).isEqualTo(10);
    }

    @Test
    @DisplayName("k5 주입 연료량 계산")
    void k5_fuel_amount() {
        K5 k5 = new K5(150);
        Assertions.assertThat(k5.getFuelAmount()).isEqualTo(11);
    }
}