package coordinate.model.figures;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import coordinate.model.Point;

import static org.assertj.core.api.Assertions.assertThat;

public class FigureFactoryTest {
    List<Point> points = new ArrayList<>();

    @Test
    void line_test() {
        points.add(new Point(1, 2));
        points.add(new Point(3, 4));

        Figure line = FigureFactory.getFigure(points);
        assertThat(line).isEqualTo(new Line(points));
    }
}
