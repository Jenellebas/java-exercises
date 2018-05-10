package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        double milesDriven;
        double gallonsUsed;
        double mpg;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven: ");
        milesDriven = in.nextDouble();
        System.out.println("Enter the amount of fuel used in gallons: ");
        gallonsUsed = in.nextDouble();
        mpg = milesDriven/gallonsUsed;
        System.out.println("Your mpg is: " + mpg);

    }
}
