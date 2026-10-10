import java.util.Scanner;
import java.util.Stack;

public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] result = new int[n];
            Stack<Integer> stack = new Stack<>();
            for (int i = 0 ; i < n ; i++) {
                a[i] = sc.nextInt();
                result[i] = -1;
            }
            for (int i = 0 ; i < n ; i++) {
                while (!stack.empty() && a[i] > a[stack.peek()]) {
                    result[stack.pop()] = a[i];
                }
                stack.push(i);
            }
            for (int i = 0 ; i < n ; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
