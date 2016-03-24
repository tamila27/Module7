package com.goit.gojavaonline.module4;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Shape area calculating:");

        System.out.println("Triangle area: ");
        System.out.println("Please enter side a: ");
        double aSide = scanner.nextDouble();
        System.out.println("Please enter side b: ");
        double bSide = scanner.nextDouble();
        System.out.println("Please enter side c: ");
        double cSide = scanner.nextDouble();
        System.out.println("Triangle area == "+ ShapeAreaCalculator.calculateTriangleArea(aSide, bSide, cSide));

        System.out.println("Rectangle area: ");
        System.out.println("Please enter side a: ");
        aSide = scanner.nextDouble();
        System.out.println("Please enter side b: ");
        bSide = scanner.nextDouble();
        System.out.println("Rectangle area == "+ ShapeAreaCalculator.calculateRectangleArea(aSide, bSide));

        System.out.println("Circle area: ");
        System.out.println("Please enter radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Circle area == "+ ShapeAreaCalculator.calculateCircleArea(radius));

        System.out.println("Temperature calculating:");
        System.out.println("Pleace enter fahrenheit degrees: ");
        double fahrenheitDegrees = scanner.nextDouble();
        System.out.println("Fahrenheit to celsius == " + TemperatureCalculator.fahrenheitToCelsiusConverter(fahrenheitDegrees));
        System.out.println("Pleace enter celsius degrees: ");
        double celsiusDegrees = scanner.nextDouble();
        System.out.println("Celsius to fahrenheit == " + TemperatureCalculator.celsiusToFahrenheitConverter(celsiusDegrees));

        System.out.println("Distance calculating: ");
        System.out.println("Please enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.println("Please enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.println("Please enter x1: ");
        double y1 = scanner.nextDouble();
        System.out.println("Please enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.println("Distance: "+DistanceCalculator.calculateDistanceBetween2Points(x1, x2, y1, y2));

    }
}
