package coordinatecalculator.view;

import coordinatecalculator.model.Point;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    public static final String INPUT_COORDINATE = "좌표를 입력하세요.";
    public static final String DELIMITER_OF_POINT = "-";
    public static final String ERROR_DUPLICATE_POINT = "중복된 좌표가 존재합니다.";
    public static final String ERROR_INVALID_COORDINATES = "올바르지 않은 입력값입니다.";

    public static List<Point> inputCoordinates() {
        System.out.println(INPUT_COORDINATE);
        String input = scanner.nextLine();

        input = input.replace(" ", "");
        checkAccuracyOfPoints(input);
        return generatePoints(input);
    }

    private static List<Point> generatePoints(String input) {
        String[] splitPoints = input.split(DELIMITER_OF_POINT);

        List<Point> points = new ArrayList<>();
        for (String splitPoint : splitPoints) {
            points.add(generatePoint(splitPoint));
        }
        checkDuplicationOf(points);
        return points;
    }

    private static void checkDuplicationOf(List<Point> points) {
        if (points.size() != new HashSet<>(points).size()) {
            throw new IllegalArgumentException(ERROR_DUPLICATE_POINT);
        }
    }

    private static Point generatePoint(String splitPoint) {
        Pattern pattern = Pattern.compile("\\(([0-9]{1,2}),([0-9]{1,2})\\)");
        Matcher matcher = pattern.matcher(splitPoint);
        if (matcher.find()) {
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            return new Point(x, y);
        }
        throw new IllegalArgumentException(ERROR_INVALID_COORDINATES);
    }

    private static void checkAccuracyOfPoints(String input) {
        Pattern pattern = Pattern.compile("(\\([0-9]{1,2},[0-9]{1,2}\\))(-(\\([0-9]{1,2},[0-9]{1,2}\\))){0,3}");
        Matcher matcher = pattern.matcher(input);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(ERROR_INVALID_COORDINATES);
        }
    }
}
