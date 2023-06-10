package coordinate.model.figures;

import java.util.Set;

import coordinate.model.Point;
import coordinate.model.Points;

public class Triangle extends AbstractFigure {

    private static final String ERROR_WRONG_FORM = "삼각형을 이루는 좌표를 입력해주세요.";
    private static final String TRIANGLE_MESSAGE = "삼각형의 넓이는 ";
    private static final int NUM_OF_UNIQUE_VALUE_FOR_TRIANGLE = 3;

    public Triangle(Points points) {
        super(points);
        triangleValidation(points);
    }

    private void triangleValidation(Points points) {
        Set<Integer> uniqueXvalues = points.getUniqueValues(Point::getX);
        Set<Integer> uniqueYvalues = points.getUniqueValues(Point::getY);

        if (isUnique(uniqueXvalues) && isUnique(uniqueYvalues))
            return;

        throw new IllegalArgumentException(ERROR_WRONG_FORM);
    }

    private boolean isUnique(Set<Integer> uniqueValues) {
        return uniqueValues.size() == NUM_OF_UNIQUE_VALUE_FOR_TRIANGLE;
    }

    @Override
    public double area() {
        Point A = getPoints().get(0);
        Point B = getPoints().get(1);
        Point C = getPoints().get(2);

        double a = B.distance(C);
        double b = A.distance(C);
        double c = A.distance(B);

        return 1.0 / 4.0 *
                sqrt(4 * square(a) * square(b) -
                        square((square(a) + square(b) - square(c))));
    }

    private double sqrt(double value) {
        return Math.sqrt(value);
    }

    private double square(double value) {
        return Math.pow(value, 2);
    }

    @Override
    public String getAreaInfo() {
        return TRIANGLE_MESSAGE + area();
    }

}
