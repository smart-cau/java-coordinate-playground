package coordinate.model;

import java.util.Objects;

public class Point {

    private final int x;
    private final int y;

    public static final int MIN = 1;
    public static final int MAX = 24;

    private static final String EXCEPTION_MESSAGE = (MIN - 1) + "과 " + (MAX - 1) + " 사이의 정수를 입력해주세요";

    public Point(int x, int y) {
        coordinateValueValidation(x, y);
        this.x = x;
        this.y = y;
    }

    private void coordinateValueValidation(int x, int y) {
        if (exceedRange(x) || exceedRange(y))
            throw new IllegalArgumentException(EXCEPTION_MESSAGE);
    }

    private boolean exceedRange(int coordinate) {
        return coordinate < MIN || coordinate > MAX;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double distance(Point b) {
        return Math.sqrt(squareDiff(this.x, b.getX()) + squareDiff(this.y, b.getY()));
    }

    private double squareDiff(int first, int second) {
        return Math.pow(first - second, 2);
    }

    public boolean isSame(int x, int y) {
        return this.x == x && this.y == y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return this. x == point.getX() && this.y == point.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

}
