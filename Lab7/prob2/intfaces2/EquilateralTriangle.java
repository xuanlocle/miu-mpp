package lesson5.lecture.intfaces2;

import java.util.List;

public class EquilateralTriangle implements Polygon {
    private double side;

    EquilateralTriangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public List<Double> getLengths() {
        return List.of(side, side, side);
    }
}
