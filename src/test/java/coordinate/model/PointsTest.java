package coordinate.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointsTest {
    List<Point> pointList = new ArrayList<>();
    Points points;

    @Test
    void IllegalArgumentException_empty_test() {
        assertThrows(IllegalArgumentException.class, () -> {
            points = new Points(pointList);
        });
    }

    @Test
    void IllegalArgumentException_onePoint_test() {
        pointList.add(new Point(1, 2));

        assertThrows(IllegalArgumentException.class, () -> {
            points = new Points(pointList);
        });
    }

    @Test
    void IllegalArgumentException_moreThanFour_test() {
        pointList.add(new Point(1, 2));
        pointList.add(new Point(2, 2));
        pointList.add(new Point(3, 2));
        pointList.add(new Point(4, 2));
        pointList.add(new Point(5, 2));

        assertThrows(IllegalArgumentException.class, () -> {
            points = new Points(pointList);
        });
    }

    @Test
    void get_test() {
        pointList.add(new Point(1, 2));
        pointList.add(new Point(2, 2));
        points = new Points(pointList);

        assertThat(points.get(0)).isEqualTo(new Point(1, 2));
    }
}
