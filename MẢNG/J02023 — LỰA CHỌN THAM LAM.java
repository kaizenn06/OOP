import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        if (s == 0) {
            if (n == 1) {
                System.out.printf("0 0");
            }
            else System.out.printf("-1 -1");
            return;
        }
        if (s > n * 9) {
            System.out.printf("-1 -1");
            return;
        }
        int sum = s;
        String max = "";
        String min = "";
        for (int i = 1 ; i <= n ; i++) {
            int digit = Math.min(9, sum);
            max += digit;
            sum -= digit;
        }
        sum = s;
        for (int i = 1 ; i < n ; i++) {
            int digit = Math.min(9, sum - 1);
            min = digit + min;
            sum -= digit;
        }
        min = sum + min;
        System.out.printf("%s %s", min, max);
    }
}
