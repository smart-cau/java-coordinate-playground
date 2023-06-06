package coordinate.view;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputViewTest {
    @Test
    public void IllegalArgumentException_wrong_number_of_points_input_test() {
        assertThrows(IllegalArgumentException.class, () -> {
            InputView.mapInputToPoints("1, 2");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            InputView.mapInputToPoints("asdfb");
        });
    }
}
