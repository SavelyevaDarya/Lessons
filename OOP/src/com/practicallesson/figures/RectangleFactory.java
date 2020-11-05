package com.practicallesson.figures;

public class RectangleFactory extends FigureAbstractFactory {

    public RectangleFactory(Points list) {
        super(list);
    }
    @Override
    public double calculateArea(Points list) {
        return 0;
    }
    @Override
    public int scale() {
        return 0;
    }

    @Override
    void getFigureShape() {

    }

/*    @Override
    public void createFigure(Points list) {

    }*/

    @Override
    public void moveTo() {

    }

    @Override
    public void rotate() {

    }


}
