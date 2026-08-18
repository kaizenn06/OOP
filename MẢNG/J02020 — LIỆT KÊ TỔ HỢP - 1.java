import java.util.*;

public class b24dccn186 {

    static int n, k;
    static int[] a = new int[20];
    static int Try(int i, int d, int last) {
        for (int j = last + 1 ; j <= n ; j++) {
            a[i] = j;
            if (i == k) {
                for (int x = 1 ; x <= k ; x++) {
                    System.out.print(a[x] + " ");
                }
                d++;
                System.out.println();
            }
            else d = Try(i + 1, d, j);
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.printf("Tong cong co %d to hop", Try(1, 0, 0));
    }
}
