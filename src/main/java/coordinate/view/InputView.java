package coordinate.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import coordinate.model.Point;
import coordinate.model.figures.Figure;
import coordinate.model.figures.FigureFactory;

public class InputView {
    private static final String INPUT_MESSAGE = "좌표를 입력하세요.";
    private static final String ERROR_WRONG_FORMAT = "잘못된 형식의 입력입니다.";
    private static final String POINTS_DELIMETER = "-";

    public static Figure getFigure() throws IOException {
        System.out.println(INPUT_MESSAGE);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        return getFigure(input);
    }

    private static Figure getFigure (String input) throws IOException {
        try {
            List<Point>  points = mapInputToPoints(input);
            return FigureFactory.getFigure(points);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return getFigure();
        }
    }

    public static List<Point> mapInputToPoints(String input) {
        List<Point> points = new ArrayList<>();

        String[] splitedInput = input.split(POINTS_DELIMETER);

        if (splitedInput.length == 0)
            throw new IllegalArgumentException(ERROR_WRONG_FORMAT);

        for (String pointInString : splitedInput) {
            Pattern pattern = Pattern.compile("\\((\\d+),(\\d+)\\)");
            Matcher matcher = pattern.matcher(pointInString);

            if (!matcher.matches())
                throw new IllegalArgumentException(ERROR_WRONG_FORMAT);

            int x = Integer.parseInt((matcher.group(1)));
            int y = Integer.parseInt((matcher.group(2)));

            Point point = new Point(x, y);
            points.add(point);
        }

        return points;
    }

}
