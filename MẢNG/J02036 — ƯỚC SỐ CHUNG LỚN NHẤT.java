import java.util.*;

public class b24dccn186 {
    static int gcd(int a,  int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0 ; i < n ; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n + 1];
            b[0] = a[0];
            for (int i = 0 ; i < n - 1 ; i++) {
                b[i + 1] = lcm(a[i], a[i + 1]);
            }
            b[n] = a[n - 1];
            for (int i = 0 ; i <= n; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
}
