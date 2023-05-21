package coordinateCalulator;

import java.io.IOException;

import coordinateCalulator.domain.Points;
import coordinateCalulator.view.InputView;
import coordinateCalulator.view.ResultView;

public class Main {
    public static void main(String[] args) throws IOException {
        String input = InputView.getInput();
        Points points = new Points(input);
        ResultView.printResult(points);
    }
}
