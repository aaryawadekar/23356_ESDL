//Assignment No - 10
//Roll No - 23356
/*Problem Statement - To compute the count of numbers co-prime with a given number N using Euler's Totient Function in Java */

import java.util.Scanner;

public class A10 {
    // Function to calculate gcd using Euclidean algorithm
    static int gcd(Integer a, Integer b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate Euler's Totient Function(phi(n))
    public static int phi(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (gcd(i, n) == 1) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int result = phi(n);
        System.out.println("The count of numbers coprime with " + n + " in the range 1 to " + n + " is: " + result);
        sc.close();
    }
}

/*Output:

Enter N: 9
The count of numbers coprime with 9 in the range 1 to 9 is: 6

Enter N: 10
The count of numbers coprime with 10 in the range 1 to 10 is: 4

Enter N: 12
The count of numbers coprime with 12 in the range 1 to 12 is: 4

Enter N: 13
The count of numbers coprime with 13 in the range 1 to 13 is: 12
*/
