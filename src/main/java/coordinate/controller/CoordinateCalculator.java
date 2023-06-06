package coordinate.controller;

import java.io.IOException;

import coordinate.model.figures.Figure;
import coordinate.view.InputView;
import coordinate.view.OutputView;

public class CoordinateCalculator {
    public static void run() throws IOException {
        Figure figure = InputView.getFigure();
        OutputView.showFigure(figure);
    }
}
