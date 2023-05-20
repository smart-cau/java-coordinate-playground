package coordinateCalulator.domain;

public class CoordinateCalulator {

    public static double lineDistance(Point a, Point b) {
        return Math.sqrt((Math.pow(a.getX() - b.getX(), 2) + (Math.pow(a.getY() - b.getY(), 2))));
    }
    
}
