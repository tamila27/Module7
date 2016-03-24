package com.goit.gojavaonline.module4;

public class ShapeAreaCalculator {

    public static double calculateTriangleArea(double aSide, double bSide, double cSide){
        double perimeter = (aSide + bSide + cSide)/2;
        return Math.sqrt(perimeter*(perimeter - aSide)*(perimeter - bSide)*(perimeter - cSide));
    }

    public static double calculateRectangleArea(double aSide, double bSide){
        return aSide * bSide;
    }
    public static double calculateCircleArea(double radius){
        return Math.PI * radius * radius;
    }
}
