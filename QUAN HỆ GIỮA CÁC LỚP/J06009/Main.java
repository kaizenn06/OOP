package J06009;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws  FileNotFoundException {
        Scanner f1 = new Scanner(new File("KH.in"));
        Scanner f2 = new Scanner(new File("MH.in"));
        Scanner f3 = new Scanner(new File("HD.in"));
        int n = Integer.parseInt(f1.nextLine());
        KhachHang[] kh = new KhachHang[n];
        for (int i = 0 ; i < n ; i++) {
            kh[i] = new KhachHang(i + 1, f1.nextLine(), f1.nextLine(), f1.nextLine(), f1.nextLine());
        }
        int m = f2.nextInt();
        MatHang[] mh = new MatHang[m];
        for (int i = 0 ; i < m ; i++) {
            f2.nextLine();
            mh[i] = new MatHang(i + 1, f2.nextLine(), f2.nextLine(), f2.nextLong(), f2.nextLong());
        }
        int k = f3.nextInt();
        HoaDon[] hd = new HoaDon[k];
        for (int i = 0 ; i < k ; i++) {
            String id_kh = f3.next();
            String id_mh = f3.next();
            int quantity = f3.nextInt();
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
            System.out.println(hd[i]);
        }
    }
}
