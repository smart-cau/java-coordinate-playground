package coordinate.model.figures;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import coordinate.model.Point;
import coordinate.model.Points;

public class RectangularTest {
    @Test
    public void illegalArgumentException_non_rectangle_points_test() {
        List<Point> pointsArg = new ArrayList<>();
        pointsArg.add(new Point(1, 2));
        pointsArg.add(new Point(5, 8));
        pointsArg.add(new Point(4, 9));
        pointsArg.add(new Point(2, 2));

        Points points = new Points(pointsArg);

        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangular(points);
        });
    }

    @Test
    public void area_test() {
        List<Point> pointsArg = new ArrayList<>();
        pointsArg.add(new Point(10, 10));
        pointsArg.add(new Point(22, 10));
        pointsArg.add(new Point(22, 18));
        pointsArg.add(new Point(10, 18));

        Points points = new Points(pointsArg);
        Rectangular rectangular = new Rectangular(points);

        assertThat(rectangular.area()).isEqualTo(96);
    }
}
