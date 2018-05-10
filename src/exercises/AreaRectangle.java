package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = in.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        width = in.nextDouble();
        area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}
