package com.practicallesson.figures;

public class TriangleFactory extends FigureAbstractFactory {

    public TriangleFactory(Points list) {
        super(list);
    }

    @Override
    void getFigureShape() {
        String shape = "треугольник";
    }

/*
    @Override
   public void createFigure(Points list) {
    }
*/

    @Override
    public double calculateArea(Points list) {
        return 0;
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
