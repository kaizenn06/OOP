import java.util.Scanner;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n + 1];
        for (int i = 1 ; i < n ; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            d[u]++;
            d[v]++;
        }
        boolean ok = false;
        for (int i = 1 ; i <= n ; i++) {
            if (d[i] == n - 1) {
                ok = true;
                break;
            }
        }
        System.out.println(ok ? "Yes" : "No");
    }
}
