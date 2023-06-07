package coordinate.model.figures;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import coordinate.model.Point;
import coordinate.model.Points;

import static org.assertj.core.api.Assertions.assertThat;

public class FigureFactoryTest {
    List<Point> pointsArg = new ArrayList<>();

    @Test
    void line_test() {
        pointsArg.add(new Point(1, 2));
        pointsArg.add(new Point(3, 4));
        Points points = new Points(pointsArg);

        Figure line = FigureFactory.getFigure(pointsArg);
        assertThat(line).isEqualTo(new Line(points));
    }
}
