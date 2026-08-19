import java.util.*;

public class b24dccn186 {

    static int[] x = new int[20];
    static boolean[] used = new boolean[20];
    static int n;
    static void check() {
        for (int i = 0 ; i < n - 1 ; i++) {
            if (Math.abs(x[i] - x[i + 1]) == 1) return;
        }
        for (int i = 0 ; i < n ; i++) {
            System.out.print(x[i]);
        }
        System.out.println();
    }
    static void Try(int i) {
        for (int j = 1 ; j <= n ; j++) {
            if (i == n) {
                check();
                return;
            }
            if (!used[j]) {
                used[j] = true;
                x[i] = j;
                Try(i + 1);
                used[j] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            n = sc.nextInt();
            Try(0);
        }
    }
}
