package coordinate.model.figures;

import coordinate.model.Points;

public interface Figure {
    Points getPoints();
    boolean hasPoint(int x, int y);
    double area();
    String getAreaInfo();
}
