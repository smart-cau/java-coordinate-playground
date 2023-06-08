package coordinate.model.figures;

import java.util.Set;

import coordinate.model.Points;

public class Rectangular extends AbstractFigure {

    private static final String ERROR_WRONG_FORM = "직사각형의 점들만 입력해야 합니다.";
    private static final String RECTANGLE_MESSAGE = "사각형의 넓이는 ";
    private static final int NUM_OF_UNIQUE_VALUE_FOR_RECTANGULAR = 2;

    public Rectangular(Points points) {
        super(points);
        rectangleValidation(points);
    }

    private void rectangleValidation(Points points) {
        Set<Integer> uniqueXvalues = points.getXuniqueValues();
        Set<Integer> uniqueYvalues = points.getYuniqueValues();

        if (hasMoreThanTwo(uniqueXvalues) || hasMoreThanTwo(uniqueYvalues))
            throw new IllegalArgumentException(ERROR_WRONG_FORM);
    }

    private boolean hasMoreThanTwo(Set<Integer> uniqueValues) {
        return uniqueValues.size() > NUM_OF_UNIQUE_VALUE_FOR_RECTANGULAR;
    }

    @Override
    public double area() {
        Set<Integer> uniqueXvalues = getPoints().getXuniqueValues();
        Set<Integer> uniqueYvalues = getPoints().getYuniqueValues();

        int width = uniqueValuesDiff(uniqueXvalues);
        int height = uniqueValuesDiff(uniqueYvalues);

        return width * height;
    }

    private int uniqueValuesDiff(Set<Integer> uniqueValues) {
        return uniqueValues.stream().reduce(0, (a, b) -> absolute(a - b));
    }

    private int absolute(int num) {
        return Math.abs(num);
    }

    @Override
    public String getAreaInfo() {
        return RECTANGLE_MESSAGE + area();
    }

}
