package coordinatecalculator.domain;

public class Triangle {
    private final CoordinatePair point1;
    private final CoordinatePair point2;
    private final CoordinatePair point3;

    public Triangle(CoordinatePair point1, CoordinatePair point2, CoordinatePair point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double calculateArea() {
        double a = point1.calculateLineLength(point2);
        double b = point2.calculateLineLength(point3);
        double c = point3.calculateLineLength(point1);
        double s = (a + b + c) / 2;

        return getResult(a, b, c, s);
    }

    /**
     *  result = root(s(s - a)(s - b)(s - c))
     */
    private double getResult(double a, double b, double c, double s) {
        double result = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return Math.round(result);
    }
}