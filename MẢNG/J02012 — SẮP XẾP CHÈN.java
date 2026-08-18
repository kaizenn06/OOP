import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++) {
            int x = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > x) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = x;
            System.out.printf("Buoc %d: ", i);
            for (int k = 0 ; k <= i ; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
