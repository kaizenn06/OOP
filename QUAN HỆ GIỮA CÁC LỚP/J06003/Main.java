package J06003;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        SinhVien[] sv = new SinhVien[n];
        BaiTL[] btl = new BaiTL[m];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            sv[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        sc.nextLine();
        for (int i = 0 ; i < m ; i++) {
            btl[i] = new BaiTL(i + 1, sc.nextLine());
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int t = sc.nextInt();
            System.out.printf("DANH SACH NHOM %d:\n", t);
            for (int i = 0 ; i < n ; i++) {
                if (sv[i].getNhom() == t) {
                    System.out.println(sv[i]);
                }
            }
            for (int i = 0 ; i < m ; i++) {
                if (btl[i].getId() == t) {
                    System.out.println(btl[i]);
                }
            }
        }
    }
}
