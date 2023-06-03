package coordinateCalulator.domain.calculators;

import coordinateCalulator.domain.Point;
import coordinateCalulator.domain.Points;

public class TriangleCalculator implements Calculator {
    private final Points points;
    private double result;

    public TriangleCalculator(Points points) {
        this.points = points;
    }

    @Override
    public double getResult() {
        Point a = points.get(0);
        Point b = points.get(1);
        Point c = points.get(2);

        double lineAsquare = Math.pow(getDistance(b, c), 2);
        double lineBsquare = Math.pow(getDistance(a, c), 2);
        double lineCsquare = Math.pow(getDistance(a, b), 2);

        // 1 / 4 equals to 0!! 두 피연산자가 모두 integer면 결과도 integer로 나오기 때문!
        double unroundedResult = (1.0 / 4.0) * Math.sqrt(
            4 * lineAsquare * lineBsquare
                    - Math.pow(lineAsquare + lineBsquare - lineCsquare, 2));

        this.result = Math.round(unroundedResult * 100) / 100.0;
        return result;
    }

    @Override
    public String getMessage() {
        return "삼각형 넓이는 ";
    }

    private double getDistance(Point a, Point b) {
        return Math.sqrt((Math.pow(a.getX() - b.getX(), 2) + (Math.pow(a.getY() - b.getY(), 2))));
    }
}
