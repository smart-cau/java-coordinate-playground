package coordinateCalulator.view;

import coordinateCalulator.domain.CoordinateCalulator;
import coordinateCalulator.domain.Point;
import coordinateCalulator.domain.Points;

public class ResultView {
    private static final int MAX_X = 24;
    private static final int MAX_Y = 24;

    public static void printResult(Points points) {
        // y axis & points
        for (int y = MAX_Y; y > 0; y--) {
            System.out.format("%3s", printEvenNumber(y) + "|");
            printPoint(y, points);
            System.out.println();
        }

        System.out.format("%2s", "");

        // x axis
        for (int x = 0; x < MAX_X; x++) {
            if (x == 0)
                System.out.print("+");
            System.out.print("---");
        }

        System.out.println();

        // values on x axis
        for (int x = 0; x <= MAX_X; x++) {
            System.out.format("%3s", printEvenNumber(x));
        }

        System.out.println();

        // distance
        printDistance(points);
    }

    private static String printEvenNumber(int value) {
        if (value % 2 == 0)
            return Integer.toString(value);
        return "";
    }

    private static void printPoint(int y, Points points) {
        for (int i = 0; i < points.size(); i++) {
            Point point = points.get(i);
            if (y == point.getY()) {
                System.out.print("   ".repeat(point.getX()) + "😊");
            }
        }
    }

    private static void printDistance(Points points) {
        double distance = CoordinateCalulator.lineDistance(points.get(0), points.get(1));
        System.out.println("두 점 사이의 거리는 " + distance);
    }
}
