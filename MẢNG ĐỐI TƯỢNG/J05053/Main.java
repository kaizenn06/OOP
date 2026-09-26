package J05053;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DonHang[] a = new DonHang[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            a[i] = new DonHang(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        Arrays.sort(a);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(a[i]);
        }
    }
}
