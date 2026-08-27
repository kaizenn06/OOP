import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0 ; i < n ; i++) {
                a[i] = sc.nextInt();
            }
            int idx = 0;
            for (int i = 0 ; i < n - 1 ; i++) {
                if (a[i] > a[i + 1]) {
                    idx = i + 1;
                    break;
                }
            }
            System.out.println(idx);
        }
    }
}
