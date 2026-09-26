package TN02012;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PhongBan[] pb = new PhongBan[n];
        for (int i = 0 ; i < n ; i++) {
            pb[i] = new PhongBan(sc.next(), sc.nextLine().trim());
        }
        int m = sc.nextInt();
        NhanVien[] nv = new NhanVien[m];
        for (int i = 0 ; i < m ; i++) {
            sc.nextLine();
            String id = sc.nextLine();
            String name = sc.nextLine();
            int salary_base = sc.nextInt();
            int days = sc.nextInt();
            PhongBan a = null;
            for (int j = 0 ; j < n ; j++) {
                if (pb[j].getId().equals(id.substring(3))) {
                    a = pb[j];
                    break;
                }
            }
            nv[i] = new NhanVien(id, name, salary_base, days, a);
            System.out.println(nv[i]);
        }
    }
}
