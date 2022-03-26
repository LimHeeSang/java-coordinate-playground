package coordinatecalculator.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public List<List<Integer>> inputCoordinate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("좌표를 입력하세요.");
        String input = scanner.nextLine();
        String[] splited = input.split("-");

        return parseCoordinates(splited);
    }

    private List<List<Integer>> parseCoordinates(String[] splited) {
        List<List<Integer>> coordinates = new ArrayList<>();
        for (String split : splited) {
            String substring = split.substring(1, 6);
            String[] stringCoordinate = substring.split(",");

            coordinates.add(parseIntegerCoordinate(stringCoordinate));
        }
        return coordinates;
    }

    private List<Integer> parseIntegerCoordinate(String[] stringCoordinate) {
        int x = Integer.parseInt(stringCoordinate[0]);
        int y = Integer.parseInt(stringCoordinate[1]);

        List<Integer> integerCoordinate = new ArrayList<>();
        integerCoordinate.add(x);
        integerCoordinate.add(y);
        return integerCoordinate;
    }
}