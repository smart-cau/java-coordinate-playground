package coordinateCalulator.domain.calculators;

import coordinateCalulator.domain.Points;

public class CalcualtorFactory {
    private CalcualtorFactory() {}

    public static Calculator getCalculator(Points points) {
        int size = points.size();
        if (size == 2) return new LineCalculator(points);
        if (size == 3) return new TriangleCalculator(points);
        if (size == 4) return new RectangleCalculator(points);
        return null;
    }
}
