package coordinateCalulator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coordinateCalulator.domain.Point;
import coordinateCalulator.domain.Points;

public class PointsTest {
    Points points;

    @BeforeEach
    void setup() {
        String input = "(10,10)-(14,15)";
        points = new Points(input);
    }

    @Test
    void size_test() {
        assertThat(points.size()).isEqualTo(2);
    }

    @Test
    void get_test() {
        assertThat(points.get(0)).isEqualTo(new Point(10, 10));
    }

    @Test
    void invalidParameterException_test() {
        assertThatThrownBy(() -> new Points("wrong input"))
                .isInstanceOf(InvalidParameterException.class);
        assertThatThrownBy(() -> new Points("(10,10)"))
                .isInstanceOf(InvalidParameterException.class);
    }
}
