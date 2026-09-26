package J05027;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        GiangVien[] gv = new GiangVien[n];
        for (int i = 0 ; i < n ; i++) {
            gv[i] = new GiangVien(i + 1, sc.nextLine(), sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String key = sc.nextLine();
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n", key);
            for (int i = 0 ; i < n ; i++) {
                if (gv[i].getName().toLowerCase().contains(key.toLowerCase())) {
                    System.out.println(gv[i]);
                }
            }
        }
    }
}
