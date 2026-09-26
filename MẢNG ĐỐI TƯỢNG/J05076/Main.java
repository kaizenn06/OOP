package J05076;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] mh = new MatHang[n];
        for (int i = 0 ; i < n ; i++) {
            mh[i] = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int m = sc.nextInt();
        HoaDon[] hd = new HoaDon[m];
        for (int i = 0 ; i < m ; i++) {
            String id = sc.next();
            long quantity_buy = sc.nextLong();
            long price_buy = sc.nextLong();
            long quantity_sell = sc.nextLong();
            MatHang a = null;
            for (int j = 0 ; j < n ; j++) {
                if (mh[j].getId().equals(id)) {
                    a = mh[j];
                    break;
                }
            }
            hd[i] = new HoaDon(id, quantity_buy, price_buy, quantity_sell, a);
            System.out.println(hd[i]);
        }
    }
}
