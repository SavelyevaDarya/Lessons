package com.practicallesson.figures;

import com.practicallesson.interfaces.ICalculatable;
import com.practicallesson.interfaces.IMovable;
import com.practicallesson.interfaces.IRotatable;
import com.practicallesson.interfaces.IScalable;

public abstract class FigureAbstractFactory implements IScalable, IMovable, ICalculatable, IRotatable, IcreateFigure, Utils {


    public FigureAbstractFactory(Points list) {
    }


    abstract void getFigureShape();
}
