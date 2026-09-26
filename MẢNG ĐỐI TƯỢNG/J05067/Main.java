package J05067;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DonHang[] dh = new DonHang[n];
        for (int i = 0 ; i < n ; i++) {
            dh[i] = new DonHang(sc.next(), sc.nextLong());
            System.out.println(dh[i]);
        }
    }
}