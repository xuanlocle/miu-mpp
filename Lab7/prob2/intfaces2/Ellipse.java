package lesson5.lecture.intfaces2;

import java.awt.*;

public class Ellipse implements ClosedCurve {
    private double semiaxis;
    private double elateral;

    Ellipse(double semiaxis, double elateral) {
        this.semiaxis = semiaxis;
        this.elateral = elateral;
    }

    @Override
    public double computePerimeter() {
        return 4 * semiaxis * elateral;
    }
}
