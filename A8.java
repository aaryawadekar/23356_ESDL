//Assignment No - 08
//Roll No - 23356
/*Problem Statement -
Alice loves solving puzzles and recently found an old parchment containing a secret 
message. However, the message is hidden within a much longer string of gibberish. 
She knows the hidden message is a substring, and she wants to find all the starting 
indices where it appears in the larger string. 
Help Alice locate every occurrence of a given substring (pattern) within a longer 
string (text).  
Use efficient algorithms such as Knuth-Morris-Pratt (KMP) or Rabin-Karp for optimal performance.
*/

import java.util.Scanner;

public class A8 {

    // Function to build the LPS (Longest Prefix Suffix) array
    public static int[] computeLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // Function to search pattern in text using KMP
    public static void KMPSearchPattern(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] lps = computeLPS(pattern);

        int i = 0;
        int j = 0;
        boolean found = false;

        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                System.out.println("Pattern found at index " + (i - j));
                found = true;
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        if (!found) {
            System.out.println("Pattern not found in the text.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = sc.nextLine();

        System.out.println("Enter the pattern:");
        String pattern = sc.nextLine();

        KMPSearchPattern(text, pattern);

        sc.close();
    }
}

/*
Output:
Enter the text:
ABABDABACDABABCABAB
Enter the pattern:
ABABCABAB
Pattern found at index 10

Enter the text:
THIS IS A TEST TEXT
Enter the pattern:
TEST
Pattern found at index 10

Enter the text:
HELLOHELLOHELLO
Enter the pattern:
HELLO
Pattern found at index 0
Pattern found at index 5
Pattern found at index 10

Enter the text:
ABCDEFG
Enter the pattern:
XYZ
Pattern not found in the text.
*/
