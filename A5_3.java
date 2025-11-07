import java.util.HashMap;
import java.util.Scanner;

public class A5_3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> list = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int n = sc.nextInt();
        sc.nextLine();

        int[] a = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            list.put(i, a[i]);
        }

    }
}
