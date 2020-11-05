package com.practicallesson.figures;

import static java.lang.Math.sqrt;

public class SquareFactory extends FigureAbstractFactory {

    public SquareFactory(Points list) {
        super(list);
    }

    @Override
    void getFigureShape() {

    }
/*    @Override
    public void createFigure(Points list) {

    }*/
    @Override
    public double calculateArea(Points list) {
        double a = sqrt(sqr(list.get(2) - list.get(0)) + sqr(list.get(3) - list.get(1)));
       // double b = sqrt(sqr(list.get(1) - list.get(0)) + sqr(list.get(1) - list.get(0)));
        return a*a;
    }

    @Override
    public void moveTo() {

    }

    @Override
    public void rotate() {

    }

    @Override
    public int scale() {
        return 0;
    }

}
