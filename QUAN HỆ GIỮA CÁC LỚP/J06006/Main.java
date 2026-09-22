package J06006;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        KhachHang[] kh = new KhachHang[n];
        for (int i = 0 ; i < n ; i++) {
            kh[i] = new KhachHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int m = sc.nextInt();
        MatHang[] mh = new MatHang[m];
        for (int i = 0 ; i < m ; i++) {
            sc.nextLine();
            mh[i] = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        int k = sc.nextInt();
        HoaDon[] hd = new HoaDon[k];
        for (int i = 0 ; i < k ; i++) {
            String id_kh = sc.next();
            String id_mh = sc.next();
            int quantity = sc.nextInt();
            KhachHang a = null;
            MatHang b = null;
            for (int j = 0 ; j < n ; j++) {
                if (kh[j].getId().equals(id_kh)) {
                    a = kh[j];
                    break;
                }
            }
            for (int j = 0 ; j < m ; j++) {
                if (mh[j].getId().equals(id_mh)) {
                    b = mh[j];
                    break;
                }
            }
            hd[i] = new HoaDon(i + 1, id_kh, id_mh, quantity, a, b);
        }
        Arrays.sort(hd);
        for (int i = 0 ; i < k ; i++) {
            System.out.println(hd[i]);
        }
    }
}

