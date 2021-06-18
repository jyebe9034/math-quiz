package com.company;

import java.util.Scanner;

/**
 * Geometry: area of a triangle
 * created: 2021. 06. 18.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();
        float x3 = scanner.nextFloat();
        float y3 = scanner.nextFloat();

        double side1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        double side2 = Math.sqrt((y3 - y2) * (y3 - y2) + (x3 - x2) * (x3 - x2));
        double side3 = Math.sqrt((y1 - y3) * (y1 - y3) + (x1 - x3) * (x1 - x3));

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println(String.format("%.1f", area));
    }
}
