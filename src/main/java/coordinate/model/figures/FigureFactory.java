package coordinate.model.figures;

import java.util.List;

import coordinate.model.Point;

public class FigureFactory {

    public static Figure getFigure(List<Point> points) {
        FigureCreator creator = new FigureCreator();
        
        return creator.create(points);
    }
    
}
