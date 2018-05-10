package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LenFive {
    public static ArrayList<String> getWords(String[] words) {
        ArrayList<String> listOfFives = new ArrayList<>();
        for (String word : words) {
            String s1 = word;
            if (s1.length() == 5) {
                listOfFives.add(s1);
            }
        }
        return listOfFives;
    }

    public static void main(String[] args) {
        String[] words = {"frog", "David", "Sophia", "eagle", "dog", "class", "lists", "end"};
        ArrayList finalList = getWords(words);
        System.out.println(finalList);

    }
}
