package exercises;

public class ArrayMax {
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] x = {4, 7, -3, 12, 15, 29, 5, 19};
        int answer = findMax(x);
        System.out.println(answer);
    }
}


