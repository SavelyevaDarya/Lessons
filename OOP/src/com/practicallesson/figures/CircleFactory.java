package com.practicallesson.figures;

public class CircleFactory extends FigureAbstractFactory {
    private int r;

    public CircleFactory(Points list, int r) {
        super(list);
        this.r = r;
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

    @Override
    void getFigureShape() {

    }

    @Override
    public double calculateArea(Points list) {
        return 0;
    }

/*    @Override
   public void createFigure(Points list, String shape) {

    }*/
}
