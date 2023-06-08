package coordinate.model.figures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import coordinate.model.Point;
import coordinate.model.Points;

public class FigureCreator {
    private static final int LINE_SIZE = 2;
    private static final int RECTANGULAR_SIZE = 4;
    
    Figure create(List<Point> pointsArg){
        Map<Integer, Figure> figures = new HashMap<>();
        Points points = new Points(pointsArg);
        
        figures.put(LINE_SIZE, new Line(points));
        figures.put(RECTANGULAR_SIZE, new Rectangular(points));
        
        return figures.get(points.size());
    }
}
