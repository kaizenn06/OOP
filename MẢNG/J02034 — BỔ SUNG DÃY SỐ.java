import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[205];
        int x = n;
        for (int i = 0 ; i < n ; i++) {
            x = sc.nextInt();
            d[x] += 1;
        }
        boolean ok = true;
        for (int i = 1 ; i <= x ; i++) {
            if (d[i] == 0) {
                ok = false;
                System.out.println(i + " ");
            }
        }
        if (ok) System.out.println("Excellent!");
    }
}
