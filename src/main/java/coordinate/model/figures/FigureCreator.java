package coordinate.model.figures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import coordinate.model.Point;

public class FigureCreator {
    private static final int LINE_SIZE = 2;
    
    Figure create(List<Point> points){
        Map<Integer, Figure> figures = new HashMap<>();
        figures.put(LINE_SIZE, new Line(points));
        
        return figures.get(points.size());
    }
}
