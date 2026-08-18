import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] sum = new int[1000005];
        for (int i = 1 ; i <= b / 2 ; i++) {
            for (int j = i * 2 ; j <= b ; j += i) {
                sum[j] += i;
            }
        }
        int d = 0;
        for (int i = a ; i <= b ; i++) {
            if (sum[i] > i) {
                d++;
            }
        }
        System.out.println(d);
    }
}
