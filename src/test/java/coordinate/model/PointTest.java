package coordinate.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {

    Point point;

    @BeforeEach
    void setup() {
        point = new Point(10, 10);
    }

    @Test
    void isEqual_test() {
        assertThat(point).isEqualTo(new Point(10, 10));
    }

    @Test
    void getCoordinateValue_test() {
        assertThat(point.getX()).isEqualTo(10);
        assertThat(point.getY()).isEqualTo(10);
    }

    @Test
    void distance_test() {
        Point pointB = new Point(14, 15);

        assertThat(point.distance(pointB)).isEqualTo(6.403124, offset(0.01));
    }

    @Test
    void illegalArgumentException_test() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Point(0, 0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Point(1, 0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Point(0, 1);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Point(25, 1);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Point(1, 25);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Point(25, 25);
        });
    }

    @Test
    void isSame_test() {
        assertThat(point.isSame(10, 10)).isTrue();
        assertThat(point.isSame(10, 1)).isFalse();
    }

    @AfterEach
    void teardown() {
        point = null;
    }
}
