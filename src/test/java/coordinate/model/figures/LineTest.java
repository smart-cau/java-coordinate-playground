package coordinate.model.figures;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import coordinate.model.Point;
import coordinate.model.Points;

public class LineTest {

    @Test
    void area_test() {
        List<Point> pointsArg = new ArrayList<>();
        pointsArg.add(new Point(10, 10));
        pointsArg.add(new Point(14, 15));
        Points points = new Points(pointsArg);

        Line line = new Line(points);

        assertThat(line.area()).isEqualTo(6.403124, offset(0.01));
    }
}
