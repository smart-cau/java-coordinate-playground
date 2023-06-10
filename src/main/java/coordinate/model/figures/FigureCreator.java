package coordinate.model.figures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import coordinate.model.Point;
import coordinate.model.Points;

public class FigureCreator {
    private static final int LINE_SIZE = 2;
    private static final int RECTANGULAR_SIZE = 4;
    private static final int TRIANGLE_SIZE = 3;

    Figure create(List<Point> pointsArg) {
        Map<Integer, Function<Points, Figure>> figures = new HashMap<>();
        Points points = new Points(pointsArg);

        figures.put(LINE_SIZE, Line::new);
        figures.put(RECTANGULAR_SIZE, Rectangular::new);
        figures.put(TRIANGLE_SIZE, Triangle::new);

        return figures.get(points.size()).apply(points);
    }
}
