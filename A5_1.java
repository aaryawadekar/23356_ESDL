//Assignment No - 05
//Roll No - 23356
/*Problem Statement - Write a Java program that uses arrays to store the marks of 5 students and
 finds the average.*/
import java.util.Scanner;

public class Assig5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the no of subjects: ");
        int n = s.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter the marks.");
        for (int i = 0; i < n; i++) {
            marks[i] = s.nextInt();
        }

        int avg = 0;
        for (int i = 0; i < n; i++) {
            avg += marks[i];
        }

        System.out.println("The average of the marks is: " + (avg / n));
        s.close();
    }
}

/*
 * Output -
 * Enter the no of subjects: 5
 * Enter the marks.
 * 99 95 100 87 89
 * The average of the marks is: 94
 */
