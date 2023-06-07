package coordinate.model.figures;


import java.util.Objects;

import coordinate.model.Points;

public abstract class AbstractFigure implements Figure {

    private final Points points;

    public AbstractFigure(Points points) {
        this.points = points;
    }

    @Override
    public Points getPoints() {
        return this.points;
    }

    @Override
    public boolean hasPoint(int x, int y) {
        return points.anyMatch(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Figure other = (Figure) o;
        Points otherPoints = other.getPoints();
        return this.getPoints().equals(otherPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getPoints());
    }
}
