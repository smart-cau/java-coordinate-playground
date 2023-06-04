package coordinate.model;

import java.util.List;

public class Points {

    private static final int MIN = 2;
    private static final int MAX = 4;
    private static final String WRONG_ARGUMENT = "Point의 개수는 " +
            MIN + "이상 " +
            MAX + "이하 여야 합니다.";

    private final List<Point> points;

    public Points(List<Point> points) {
        pointsValidation(points);
        this.points = points;
    }

    private void pointsValidation(List<Point> points) {
        if (points.size() < 2)
            throw new IllegalArgumentException(WRONG_ARGUMENT);
        if (points.size() > 4)
            throw new IllegalArgumentException(WRONG_ARGUMENT);
    }

    public Point get(int index) {
        return points.get(index);
    }

}
