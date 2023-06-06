package coordinate.view;

import coordinate.model.Point;
import coordinate.model.figures.Figure;

public class OutputView {

    private static final String VERTICAL_AXIS = "|";
    private static final String ORIGIN = "+";
    private static final String HORIZONTAL_AXIS = "----";
    private static final String FOUR_BLANKS = "    ";
    private static final String ERROR_MARK_OF_POINT = "😊";

    public static void showFigure(Figure figure) {
        drawVertical(figure);
        drawHorizontal();
        getAreaInfo(figure);
    }

    private static void drawVertical(Figure figure) {
        for (int y = Point.MAX; y > 0; y--) {
            drawVerticalNumber(y);
            System.out.print(VERTICAL_AXIS);
            drawPoint(figure, y);
            printNewLine();
        }
    }

    private static void drawVerticalNumber(int y) {
        if (y % 2 == 0) {
            System.out.print(String.format("%4d", y));
            return;
        }
        System.out.print(FOUR_BLANKS);
    }

    private static void drawPoint(Figure figure, int y) {
        for (int x = Point.MIN; x <= Point.MAX; x++) {
            if (figure.hasPoint(x, y))
                System.out.print(ERROR_MARK_OF_POINT);
            System.out.print(FOUR_BLANKS);
        }
    }

    private static void printNewLine() {
        System.out.println();
    }

    private static void drawHorizontal() {
        for (int x = 0; x <= Point.MAX; x++) {
            drawHorizontalAxis(x);
        }

        printNewLine();

        for (int x = 0; x <= Point.MAX; x++) {
            drawHorizontalNumber(x);
        }

        printNewLine();
    }

    private static void drawHorizontalAxis(int x) {
        if (x == 0) {
            System.out.print(FOUR_BLANKS + ORIGIN);
            return;
        }
        System.out.print(HORIZONTAL_AXIS);
    }

    private static void drawHorizontalNumber(int x) {
        if (x % 2 == 0) {
            System.out.print(String.format("%4s", x));
            System.out.print(FOUR_BLANKS);
        }
        //
    }

    private static void getAreaInfo(Figure figure) {
        System.out.println(figure.getAreaInfo());
    }

}
