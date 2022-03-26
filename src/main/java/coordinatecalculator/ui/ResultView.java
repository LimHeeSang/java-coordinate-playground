package coordinatecalculator.ui;

public class ResultView {
    public void printLine(Double result) {
        System.out.println("두 점 사이 거리는" + result);
    }

    public void printTriangle(Double result) {
        System.out.println("삼각형 넓이는" + result);
    }

    public void printRectangle(int result) {
        System.out.println("사각형 넓이는" + result);
    }
}