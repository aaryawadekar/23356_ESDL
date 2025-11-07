//Assignment No - 09
//Roll No - 23356
/*Problem Statement -
Write a program that constructs the suffix array for the given string.
A single string S of length 1 ≤ |S| ≤ 10^5, consisting of lowercase English letters.
*/

import java.util.Arrays;
import java.util.Scanner;

public class A9 {
    public static Integer[] buildSuffixArray(String text) {
        int length = text.length();
        Integer[] suffixArr = new Integer[length];

        for (int i = 0; i < length; i++) {
            suffixArr[i] = i;
        }

        // Sort suffixes lexicographically
        Arrays.sort(suffixArr, (a, b) -> {
            int maxLen = length - Math.max(a, b);
            for (int i = 0; i < maxLen; i++) {
                char c1 = text.charAt(a + i);
                char c2 = text.charAt(b + i);
                if (c1 != c2) {
                    return c1 - c2;
                }
            }
            return (length - a) - (length - b);
        });

        return suffixArr;
    }

   //Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        Integer[] suffixArray = buildSuffixArray(text);

        System.out.println("Suffix Array:");
        for (int index : suffixArray) {
            System.out.print(index + " ");
        }
        System.out.println();

        sc.close();
    }
}

/*Output:

Enter the text: banana
Suffix Array:
5 3 1 0 4 2

Enter the text: abracadabra
Suffix Array:
10 7 0 3 5 8 1 4 6 9 2
*/
