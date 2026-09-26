package J05022;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0 ; i < n ; i++) {
            sv[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String lop = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n", lop);
            for (SinhVien x : sv) {
                if (x.getLop().equals(lop)) {
                    System.out.println(x);
                }
            }
        }
    }
}
