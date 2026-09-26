package J05048;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MaHang[] a = new MaHang[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            a[i] = new MaHang(sc.nextLine(), sc.nextLong());
            System.out.println(a[i]);
        }
    }
}
