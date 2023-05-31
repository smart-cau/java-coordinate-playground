package coordinateCalulator.domain.calculators;

import coordinateCalulator.domain.Point;
import coordinateCalulator.domain.Points;

public class RectangleCalculator implements Calculator {

    private double result;
    private final Points points;

    public RectangleCalculator(Points points) {
        this.points = points;
    }

    @Override
    public double getResult() {
        Point standard = points.get(0);

        int width = 0;
        int height = 0;

        for (int i = 1; i < points.size(); i++) {
            Point point = points.get(i);
            if (point.getX() == standard.getX()) {
                height = Math.abs(point.getY() - standard.getY());
            }
            if (point.getY() == standard.getY()) {
                width = Math.abs(point.getX() - standard.getX());
            }
        }

        this.result = width * height;

        return result;
    }

    @Override
    public String getMessage() {
        return "사각형의 넓이는 ";
    }

}
