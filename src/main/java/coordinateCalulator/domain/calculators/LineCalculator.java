package coordinateCalulator.domain.calculators;

import coordinateCalulator.domain.Point;
import coordinateCalulator.domain.Points;

public class LineCalculator implements Calculator {

    private final Points points;
    private double result;

    public LineCalculator(Points points) {
        this.points = points;
    }

    @Override
    public double getResult() {
        Point a = points.get(0);
        Point b = points.get(1);

        this.result = Math.sqrt((Math.pow(a.getX() - b.getX(), 2) + (Math.pow(a.getY() - b.getY(), 2))));

        return result;
    }

    @Override
    public String getMessage() {
        return "두 점 사이의 거리는 ";
    }
    
}
