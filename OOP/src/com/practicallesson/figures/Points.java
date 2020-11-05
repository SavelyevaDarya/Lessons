package com.practicallesson.figures;

import jdk.nashorn.internal.parser.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Points {

    List<Integer> pointsArray = new ArrayList<>();
    private Object RectangleFactory;

    public void addPoint(int point) {
        pointsArray.add(point);
    }
    public void getSize(){
        for (int b = 0; b < pointsArray.size(); b++) {
            System.out.print(pointsArray.get(b));
        }
    }

    public void defineFigure() {
    }

    public int get(int i) {
        return 0;
    }
}
