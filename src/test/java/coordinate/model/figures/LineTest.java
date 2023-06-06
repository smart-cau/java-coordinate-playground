package coordinate.model.figures;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import coordinate.model.Point;

public class LineTest {

    @Test
    void area_test() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(10, 10));
        points.add(new Point(14, 15));

        Line line = new Line(points);

        assertThat(line.area()).isEqualTo(6.403124, offset(0.01));
    }
}
