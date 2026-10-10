import java.util.Arrays;
import java.util.Scanner;

public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int l = 0, r = n - 1;
            long d = 0;
            while (l < r) {
                int sum = a[l] + a[r];
                if (sum == k) {
                    if (a[l] == a[r]) {
                        long m = r - l + 1;
                        d += m * (m - 1) / 2;
                        break;
                    }
                    int x = a[l], y = a[r];
                    long cntL = 0, cntR = 0;
                    while (l < r && a[l] == x) {
                        cntL++;
                        l++;
                    }
                    while (r >= l && a[r] == y) {
                        cntR++;
                        r--;
                    }
                    d += cntL * cntR;
                }
                else if (sum > k) r--;
                else l++;
            }
            System.out.println(d);
        }
    }
}
