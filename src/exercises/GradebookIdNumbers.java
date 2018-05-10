package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookIdNumbers {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newId;
        System.out.println("Enter students or press Enter to finish: ");
        //Get student names and ID;
        do {
            System.out.print("Student ID number: ");
            newId = in.nextInt();
            in.nextLine();
            if (!newId.equals("")) {
                System.out.print("Student name: ");
                String newName = in.nextLine();
                students.put(newId, newName);
            }
        } while (!newId.equals(0));
        // Print class roster
        System.out.println("\nClass Roster: ");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() +  "   " + student.getValue());
        }
    }
}
