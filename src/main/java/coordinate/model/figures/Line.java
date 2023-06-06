package coordinate.model.figures;

import java.util.List;

import coordinate.model.Point;
import coordinate.model.Points;

public class Line extends AbstractFigure {

    private static final String LINE_MESSAGE = "두 점 사이의 거리는 ";
    
    public Line(List<Point> points) {
        super(points);
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
