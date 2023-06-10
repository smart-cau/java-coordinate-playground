package coordinate.model.figures;

import coordinate.model.Point;
import coordinate.model.Points;

public class Line extends AbstractFigure {

    private static final String ERROR_WRONG_FORM = "직선의 점은 2개여야 합니다.";
    private static final String LINE_MESSAGE = "두 점 사이의 거리는 ";
    private static final int NUM_OF_UNIQUE_VALUE_FOR_LINE = 2;

    public Line(Points points) {
        super(points);
        lineValidation(points);
    }

    private void lineValidation(Points points) {
        if (points.size() != NUM_OF_UNIQUE_VALUE_FOR_LINE)
            throw new IllegalArgumentException(ERROR_WRONG_FORM);
    }

    @Override
    public double area() {
        Points points = super.getPoints();
        Point a = points.get(0);
        Point b = points.get(1);
        return a.distance(b);
    }

    @Override
    public String getAreaInfo() {
        return LINE_MESSAGE + this.area();
    }
}
