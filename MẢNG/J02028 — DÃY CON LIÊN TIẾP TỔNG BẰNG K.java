import java.util.*;

public class b24dccn186 {
    static int t, n;
    static long k;
    static Integer[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextLong();
            a = new Integer[n];
            for (int i = 0 ; i < n ; i++) {
                a[i] = sc.nextInt();
            }
            int l = 0, r = 0;
            long sum = 0;
            boolean ok = false;
            while (r < n) { 
                sum += a[r];
                while (sum > k) {
                    sum -= a[l];
                    l++;
                }
                if (sum == k && l <= r) {
                    ok = true;
                    break; 
                } 
                r++;
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
