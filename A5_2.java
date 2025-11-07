//Assignment No - 05
//Roll No - 23356
/*Problem Statement - Use HashMap to store and display student names with their roll numbers */

import java.util.Scanner;
import java.util.HashMap;

public class Assig5_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, String> student = new HashMap<>();

        // Defining elements
        student.put(1, "Arpita");
        student.put(2, "Suhani");
        student.put(3, "Sneha");
        student.put(4, "Trupti");

        // Removing one element using key
        student.remove(1);

        // Displaying the hash map
        for (Integer roll : student.keySet()) {
            System.out.println("Roll Number: " + roll + ", Name: " + student.get(roll));
        }
    }
}

/*
 * Output -
 * Roll Number: 2, Name: Suhani
 * Roll Number: 3, Name: Sneha
 * Roll Number: 4, Name: Trupti
 */
