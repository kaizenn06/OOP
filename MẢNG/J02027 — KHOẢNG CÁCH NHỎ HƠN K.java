import java.util.*;

public class b24dccn186 {
    static int t, n, k;
    static Integer[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            a = new Integer[n];
            for (int i = 0 ; i < n ; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int l = 0;
            int r = 0;
            long ans = 0;
            while (l < n) {
                while (r < n && a[r] - a[l] < k) {
                    r++;
                }
                ans += r - l - 1;
                l++;
            }
            System.out.println(ans);
        }
    }
}
