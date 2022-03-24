package rentcompany;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    public static final String NEWLINE = System.getProperty("line.separator");
    private final List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

    public String getReport() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getName()).append(" : ").append(car.getFuelAmount(new FuelCalculationStrategyImpl())).append("리터").append(NEWLINE);
        }
        return sb.toString();
    }
}