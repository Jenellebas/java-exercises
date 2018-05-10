package exercises;

//import java.util.Scanner;

public class getAliceMessage {
        public static String getAliceMatch(String searchTermLower) {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String textLower = text.toLowerCase();
        //Scanner in = new Scanner(System.in);
        //System.out.println("Enter the word you wish to search for: ");
        //searchTerm = in.next();
        //searchTermLower = searchTerm.toLowerCase();

        if (textLower.contains(searchTermLower)) {
            return "True";
        }  else {
            return "False";
        }
    }
}
