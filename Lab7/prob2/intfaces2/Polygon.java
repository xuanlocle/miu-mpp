package lesson5.lecture.intfaces2;

import java.util.List;

public interface Polygon extends ClosedCurve {
    @Override
    default double computePerimeter() {
        double perimeter = 0;
        for (double length : getLengths()) {
            perimeter += length;
        }
        return perimeter;
    }

    List<Double> getLengths();
}
