package coordinatecalculator.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public List<List<Integer>> inputCoordinate() {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] splited = s.split("-");

        List<List<Integer>> list = new ArrayList<>();
        for (String split : splited) {
            String substring = split.substring(1, 6);
            String[] stringCoordinate = substring.split(",");

            list.add(parseIntegerCoordinate(stringCoordinate));
        }
        return list;
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
