//Assignment No - 11
//Roll No - 23356
/*Problem Statement - Sliding windows and two pointers
 Java program to find longest sub-array having sum k using Hash Map and Prefix Sum
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A11_1 {
    public static int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == k) {
                maxLength = i + 1;
            } else if (map.containsKey(prefixSum - k)) {
                int length = i - map.get(prefixSum - k);
                if (length > maxLength) {
                    maxLength = length;
                }
            }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum k: ");
        int k = sc.nextInt();

        int result = longestSubarray(arr, k);
        System.out.println("Longest subarray length with sum = " + k + " is: " + result);

        sc.close();
    }
}

/*
OUTPUT:

Test Case 1:
Enter the number of elements: 5
Enter the elements:
1 2 3 4 5
Enter the target sum k: 9
Longest subarray length with sum = 9 is: 2

Test Case 2:
Enter the number of elements: 7
Enter the elements:
10 5 2 7 1 9 3
Enter the target sum k: 15
Longest subarray length with sum = 15 is: 4

Test Case 3:
Enter the number of elements: 6
Enter the elements:
-1 2 3 -2 4 2
Enter the target sum k: 5
Longest subarray length with sum = 5 is: 4

Test Case 4:
Enter the number of elements: 6
Enter the elements:
1 2 3 -3 4 5
Enter the target sum k: 6
Longest subarray length with sum = 6 is: 5

Test Case 5:
Enter the number of elements: 5
Enter the elements:
1 1 1 1 1
Enter the target sum k: 3
Longest subarray length with sum = 3 is: 3
*/
