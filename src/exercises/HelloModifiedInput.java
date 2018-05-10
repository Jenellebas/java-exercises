package exercises;

import java.util.Scanner;

public class HelloModifiedInput {
    public static void main(String[] args) {
        String username;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your username");
        username = in.next();
        System.out.println("Hello, " + username);
    }
}
