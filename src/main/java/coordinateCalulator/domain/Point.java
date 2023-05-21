package coordinateCalulator.domain;

import java.security.InvalidParameterException;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        pointValidation(x, y);
        this.x = x;
        this.y = y;
    }

    private void pointValidation(int x, int y) {
        if (x < 0 || x > 24)
            throw new InvalidParameterException();
        if (y < 0 || y > 24)
            throw new InvalidParameterException();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Point point = (Point) o;
        return this.x == point.getX() && this.y == point.getY();
    }
}
