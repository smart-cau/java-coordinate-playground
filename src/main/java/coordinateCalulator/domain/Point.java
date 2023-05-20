package coordinateCalulator.domain;

import java.security.InvalidParameterException;

public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        pointValidation(x, y);
        this.x = x;
        this.y = y;
    }

    private void pointValidation(double x, double y) {
        if (x < 0 || x > 24)
            throw new InvalidParameterException();
        if (y < 0 || y > 24)
            throw new InvalidParameterException();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
