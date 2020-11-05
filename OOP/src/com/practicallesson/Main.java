package com.practicallesson;

import com.practicallesson.figures.FigureAbstractFactory;
import com.practicallesson.figures.Points;
import com.practicallesson.figures.RectangleFactory;
import com.practicallesson.figures.SquareFactory;
import com.practicallesson.interfaces.ICalculatable;
import com.practicallesson.interfaces.IScalable;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.lang.Double;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Points list = new Points();
        printOut();
        int param = scanner.nextInt();
        while (param!=0){
            switch (param){
                case 1:
                    System.out.println("Пожалуйста введите координаты");
                    scanner.nextLine();
                    int task1 = scanner.nextInt();
                    list.addPoint(task1);
                    FigureAbstractFactory figure = new SquareFactory(list);
                  //  square.createFigure(list);
                    System.out.println("Выберите действие с фигурой\n");
                    System.out.println("Площадь фигуры: " + figure.calculateArea(list));
                    printOutMoves();
                    scanner.nextLine();
                    param = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Выберите действие с фигурой");
                    scanner.nextLine();
                    param = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Выберите действие с фигурой");
                    param = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Выберите действие с фигурой");
                    param = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Выберите действие с фигурой");
                    param = scanner.nextInt();
                    break;
                case 6:

                    break;
                default:
                    param = 0;

            }

        }

        // System.out.println("Please enter coordinats");

        // CreateFigure rectangle1 = new CreateFigure();
        //    FigureAbstractFactory rectangle = new RectangleFactory(5,8,14, 20);
        //   Calculate(rectangle);
        //   Scale(rectangle);

  /*      public static void Calculate (ICalculatable calc){
            System.out.println("calculate area is " + calc.calculateArea());
        }

        public static void Scale (IScalable scaleFigure){
            System.out.println("scale Figure is " + scaleFigure.scale());
        }*/

    }
    private static void printOut() {
        System.out.println("Пожалуйста выберите фигуру: \n"
                + "1 чтобы создать квадрат \n"
                + "2 чтобы создать прямоугольник \n"
                + "3 чтобы создать треугольник \n"
                + "4 чтобы создать круг \n"
                + "0 чтобы выйти \n");
    }
    private static void printOutMoves() {
        System.out.println("Пожалуйста выберите действие: \n"
                + "6 рассчитать площадь \n"
                + "7 повернуть на \n"
                + "8 переместить на \n"
                + "9 увеличить/ уменьшить в \n"
                + "10 чтобы выйти \n");
    }
}
