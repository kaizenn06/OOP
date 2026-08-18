import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0 ; i < n ; i++) {
                a[i] = sc.nextLong();
                a[i] = a[i] * a[i];
            }
            Arrays.sort(a);
            boolean ok = false;
            for (int i = n - 1 ; i >= 0 ; i--) {
                int l = 0;
                int r = i - 1;
                while (l >= 0 && r >= 0) {
                    if (a[l] + a[r] == a[i]) {
                        ok = true;
                        break;
                    }
                    else if (a[l] + a[r] < a[i]) l++;
                    else r--;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
