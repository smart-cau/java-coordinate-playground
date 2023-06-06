package coordinate.model.figures;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coordinate.model.Point;

public class LineTest {
    Point point;

    @BeforeEach
    void setup() {
        point = new Point(10, 10);
    }

    @Test
    void distance_test() {
        Point pointB = new Point(14, 15);

        assertThat(point.distance(pointB)).isEqualTo(6.403124, offset(0.01));
    }
}
