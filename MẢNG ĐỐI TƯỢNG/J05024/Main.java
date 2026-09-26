package J05024;

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
            String specialized = sc.nextLine().toUpperCase();
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", specialized);
            for (SinhVien x : sv) {
                if (x.getSpecialized().equals(specialized)) {
                    if ((specialized.equals("CONG NGHE THONG TIN") || specialized.equals("AN TOAN THONG TIN")) && x.getGrade().startsWith("E")) {
                        continue;
                    }
                    System.out.println(x);
                }
            }
        }
    }
}
