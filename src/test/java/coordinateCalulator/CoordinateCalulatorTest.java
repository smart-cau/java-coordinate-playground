package coordinateCalulator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import coordinateCalulator.domain.Points;
import coordinateCalulator.domain.calculators.CalcualtorFactory;
import coordinateCalulator.domain.calculators.Calculator;
import coordinateCalulator.domain.calculators.LineCalculator;
import coordinateCalulator.domain.calculators.RectangleCalculator;

public class CoordinateCalulatorTest {

    String input;
    Points points;

    @Test
    void lineCalcualtorFactory_test() {
        input = "(10,10)-(14,15)";
        points = new Points(input);

        Calculator calculator = CalcualtorFactory.getCalculator(points);

        assertThat(calculator.getClass()).isEqualTo(new LineCalculator(points).getClass());
    }

    @Test
    void rectangleCalcualtorFactory_test() {
        input = "(10,10)-(14,15)-(10,10)-(14,15)";
        points = new Points(input);

        Calculator calculator = CalcualtorFactory.getCalculator(points);

        assertThat(calculator.getClass()).isEqualTo(new RectangleCalculator(points).getClass());
    }

    @Test
    void lineDistance_test() {
        input = "(0,0)-(5,5)";
        points = new Points(input);

        Calculator lineCalculator = CalcualtorFactory.getCalculator(points);

        assertThat(lineCalculator.getResult())
                .isEqualTo(Math.sqrt(50), offset(0.0001));
    }

    @Test
    void rectangleCalcualte_test() {
        input = "(10,10)-(22,10)-(22,18)-(10,18)";
        points = new Points(input);
        Calculator calculator = CalcualtorFactory.getCalculator(points);

        assertThat(calculator.getResult()).isEqualTo(96, offset(0.0001));
    }
}
