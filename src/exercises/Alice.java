package exercises;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String searchTerm;
        String searchTermLower;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word you wish to search for: ");
        searchTerm = in.nextLine();
        searchTermLower = searchTerm.toLowerCase();
        String message = getAliceMessage.getAliceMatch(searchTermLower);
        System.out.println(message);
    }
}
