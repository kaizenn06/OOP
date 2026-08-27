import java.util.*;

public class b24dccn186 {
    static int n, k;
    static Integer[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new Integer[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0 ; i < n ; i++) {
            while (a[i] < 0 && k != 0) {
                a[i] = -a[i];
                k--;
            }
        }
        int min = Integer.MAX_VALUE;
        long sum = 0;
        for (int i = 0 ; i < n ; i++) {
            sum += a[i];
            min = Math.min(min, a[i]);
        }
        if (k % 2 == 1) {
            System.out.println(sum - 2 * min);
        }
        else System.out.println(sum);
    }
}
