package coordinateCalulator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import coordinateCalulator.domain.CoordinateCalulator;
import coordinateCalulator.domain.Point;

public class CoordinateCalulatorTest {

    @Test
    void lineDistance_test() {
        Point a = new Point(0, 0);
        Point b = new Point(5, 5);

        assertThat(CoordinateCalulator.lineDistance(a, b))
                .isEqualTo(Math.sqrt(50), offset(0.0001));
    }
}
