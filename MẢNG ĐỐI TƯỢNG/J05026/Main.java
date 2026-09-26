package J05026;

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
            String[] subject = sc.nextLine().trim().toUpperCase().split("\\s+");
            String sbj = "";
            for (String x : subject) sbj += x.charAt(0);
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n", sbj);
            for (int i = 0 ; i < n ; i++) {
                if (gv[i].getSubject().equals(sbj)) {
                    System.out.println(gv[i]);
                }
            }
        }
    }
}
