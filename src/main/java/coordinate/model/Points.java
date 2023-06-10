package coordinate.model;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;

import static java.util.stream.Collectors.toSet;

public class Points {

    private static final int MIN = 2;
    private static final int MAX = 4;
    private static final String WRONG_ARGUMENT = "Point의 개수는 " +
            MIN + "이상 " +
            MAX + "이하 여야 합니다.";
    private static final String ERROR_DUPLICATED_POINTS = "중복된 좌표는 입력할 수 없습니다.";

    private final List<Point> points;

    public Points(List<Point> points) {
        pointsValidation(points);
        this.points = points;
    }

    private void pointsValidation(List<Point> points) {
        if (points == null)
            throw new IllegalArgumentException(WRONG_ARGUMENT);
        if (points.size() < 2)
            throw new IllegalArgumentException(WRONG_ARGUMENT);
        if (points.size() > 4)
            throw new IllegalArgumentException(WRONG_ARGUMENT);
        if (points.size() != new HashSet<>(points).size())
            throw new IllegalArgumentException(ERROR_DUPLICATED_POINTS);
    }

    public Point get(int index) {
        return points.get(index);
    }

    public boolean anyMatch(int x, int y) {
        return this.points.stream()
                .anyMatch((point) -> point.isSame(x, y));
    }

    public int size() {
        return this.points.size();
    }

    public Set<Integer> getUniqueValues(Function<Point, Integer> getter) {
        return this.points.stream().map(getter).collect(toSet());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Points other = (Points) o;
        for (int i = 0; i < this.points.size(); i++) {
            if (!this.points.get(i).equals(other.points.get(i)))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.points);
    }
}
