package coordinate.model.figures;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import coordinate.model.Point;
import coordinate.model.Points;

public class TriangleTest {
    // (10,10)-(14,15)-(20,8)
    @Test
    public void illegalArgumentException_non_triangle_points_same_x_test() {
        List<Point> pointsArg = new ArrayList<>();
        pointsArg.add(new Point(1, 2));
        pointsArg.add(new Point(1, 5));
        pointsArg.add(new Point(1, 6));

        Points points = new Points(pointsArg);

        assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(points);
        });
    }

    @Test
    public void illegalArgumentException_non_triangle_points_same_y_test() {
        List<Point> pointsArg = new ArrayList<>();
        pointsArg.add(new Point(2, 1));
        pointsArg.add(new Point(5, 1));
        pointsArg.add(new Point(6, 1));

        Points points = new Points(pointsArg);

        assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(points);
        });
    }

    @Test
    public void area_test() {
        List<Point> pointsArg = new ArrayList<>();
        pointsArg.add(new Point(10, 10));
        pointsArg.add(new Point(14, 15));
        pointsArg.add(new Point(20, 8));

        Points points = new Points(pointsArg);

        Triangle triangle = new Triangle(points);

        assertThat(triangle.area()).isEqualTo(29, offset(0.001));
    }

}
