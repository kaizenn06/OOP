package J05023;

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
            String khoa = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", khoa);
            for (SinhVien x : sv) {
                if (x.getLop().substring(1,3).equals(khoa.substring(2))) {
                    System.out.println(x);
                }
            }
        }
    }
}
