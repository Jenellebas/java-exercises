package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = in.nextDouble();
        while (radius < 0) {
            System.out.println("You must enter a positive number!");
            System.out.println("Enter a radius: ");
            radius = in.nextDouble();
        }
        area = radius * radius * Math.PI;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
