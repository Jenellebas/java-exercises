package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumberSum {
    public static int getEvens(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1,3,4,6,5,12,14,15,4,15};
        int totalSum = getEvens(numbers);
        System.out.println(totalSum);
    }
}
