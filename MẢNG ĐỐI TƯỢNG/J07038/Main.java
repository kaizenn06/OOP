package J07038;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DN.in"));
        Scanner sc3 = new Scanner(new File("THUCTAP.in"));
        int n = Integer.parseInt(sc1.nextLine());
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0 ; i < n ; i++) {
            sv[i] = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
        }
        int m = sc2.nextInt();
        DoanhNghiep[] dn = new DoanhNghiep[m];
        for (int i = 0 ; i < m ; i++) {
            sc2.nextLine();
            dn[i] = new DoanhNghiep(sc2.nextLine(), sc2.nextLine(), sc2.nextInt());
        }
        int k = sc3.nextInt();
        ThucTap[] tt = new ThucTap[k];
        for (int i = 0 ; i < k ; i++) {
            String msv = sc3.next();
            String mdn = sc3.next();
            SinhVien a = null;
            for (int j = 0 ; j < n ; j++) {
                if (sv[j].getId().equals(msv)) {
                    a = sv[j];
                    break;
                }
            }
            DoanhNghiep b = null;
            for (int j = 0 ; j < m ; j++) {
                if (dn[j].getId().equals(mdn)) {
                    b = dn[j];
                    break;
                }
            }
            tt[i] = new ThucTap(msv, mdn, a, b);
        }
        Arrays.sort(tt);
        int q = sc3.nextInt();
        while (q-- > 0) {
            String id = sc3.next();
            int idx = 0;
            for (int i = 0 ; i < m ; i++) {
                if (dn[i].getId().equals(id)) {
                    System.out.printf("DANH SACH THUC TAP TAI %s:\n", dn[i].getName());
                    idx = i;
                    break;
                }
            }
            int d = 0;
            for (int i = 0 ; i < k && d < dn[idx].getQuantity() ; i++) {
                if (tt[i].getDn().getId().equals(id)) {
                    System.out.println(tt[i]);
                    d++;
                }
            }
        }
    }
}
