package coordinateCalulator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.Test;

import coordinateCalulator.domain.Point;

public class PointTest {
    @Test
    void outranged_point_test() {
        assertThatThrownBy(() -> new Point(25, 0))
                .isInstanceOf(InvalidParameterException.class);
        assertThatThrownBy(() -> new Point(0, 25))
                .isInstanceOf(InvalidParameterException.class);
        assertThatThrownBy(() -> new Point(-1, 1))
                .isInstanceOf(InvalidParameterException.class);
        assertThatThrownBy(() -> new Point(1, -1))
                .isInstanceOf(InvalidParameterException.class);
    }

    @Test
    void getCoordinate_test() {
        Point point = new Point(1, 5);
        double x = point.getX();
        double y = point.getY();

        assertThat(x).isEqualTo((double) 1);
        assertThat(y).isEqualTo((double) 5);
    }

    @Test
    void equals_test() {
        Point point = new Point(1, 5);

        assertThat(point).isEqualTo(new Point(1, 5));
    }
}
