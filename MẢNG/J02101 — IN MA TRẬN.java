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
            Integer[][] a = new Integer[n][n];
            for (int i = 0 ; i < n ; i++) {
                for (int j = 0 ; j < n ; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0 ; i < n ; i++) {
                if (i % 2 == 0) {
                    for (int j = 0 ; j < n ; j++) {
                        System.out.print(a[i][j] + " ");
                    }
                }
                else {
                    for (int j = n - 1 ; j >= 0 ; j--) {
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
