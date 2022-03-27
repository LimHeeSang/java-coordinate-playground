package coordinatecalculator.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public static List<List<Integer>> inputCoordinates() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("좌표를 입력하세요.");
        String input = scanner.nextLine();
        String[] splited = input.split("-");

        return parseCoordinates(splited);
    }

    private static List<List<Integer>> parseCoordinates(String[] splited) {
        List<List<Integer>> coordinates = new ArrayList<>();
        for (String split : splited) {
            String replaceString = split.replace("(", "").replace(")", "");
            String[] stringCoordinate = replaceString.split(",");

            coordinates.add(parseIntegerCoordinate(stringCoordinate));
        }
        return coordinates;
    }

    private static List<Integer> parseIntegerCoordinate(String[] stringCoordinate) {
        int x = Integer.parseInt(stringCoordinate[0]);
        int y = Integer.parseInt(stringCoordinate[1]);

        List<Integer> integerCoordinate = new ArrayList<>();
        integerCoordinate.add(x);
        integerCoordinate.add(y);
        return integerCoordinate;
    }
}