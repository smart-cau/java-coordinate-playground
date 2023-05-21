package coordinateCalulator.domain;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Points {

    private final List<Point> points;

    public Points(String input) {
        this.points = mapStringToPoints(input);
    }

    private List<Point> mapStringToPoints(String input) {
        List<Point> points = new ArrayList<>();

        String[] splitedPointsString = input.split("-");

        if (splitedPointsString.length < 2)
            throw new InvalidParameterException();

        Stream.of(splitedPointsString)
                .forEach(pointString -> {
                    Pattern pattern = Pattern.compile("\\((\\d+),(\\d+)\\)");
                    Matcher matcher = pattern.matcher(pointString);

                    if (matcher.matches()) {
                        int x = Integer.parseInt((matcher.group(1)));
                        int y = Integer.parseInt((matcher.group(2)));
                        Point point = new Point(x, y);
                        points.add(point);
                    }
                });

        return points;
    }

    public int size() {
        return points.size();
    }

    public Point get(int index) {
        return points.get(index);
    }
}
