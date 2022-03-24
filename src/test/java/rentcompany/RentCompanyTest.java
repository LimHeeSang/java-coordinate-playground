package rentcompany;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RentCompanyTest {

    @Test
    void report() {
        RentCompany company = new RentCompany();
        company.add(new Sonata(150));
        company.add(new K5(260));
        company.add(new Sonata(120));
        company.add(new Avante(300));
        company.add(new K5(390));

        String report = company.getReport();
        Assertions.assertThat(report).isEqualTo(
                "SONATA : 15리터" + RentCompany.NEWLINE +
                "K5 : 20리터" + RentCompany.NEWLINE +
                "SONATA : 12리터" + RentCompany.NEWLINE +
                "AVANTE : 20리터" + RentCompany.NEWLINE +
                "K5 : 30리터" + RentCompany.NEWLINE
        );
    }
}
