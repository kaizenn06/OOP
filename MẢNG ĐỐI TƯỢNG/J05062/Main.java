package J05062;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        double gpa = 0;
        SinhVien[] goc = new SinhVien[n];
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            goc[i] = new SinhVien(sc.nextLine(), sc.nextDouble(), sc.nextInt());
            sv[i] = goc[i];
        }
        Arrays.sort(sv);
        for (int i = 0; i < n; i++) {
            if (!sv[i].getStatus().equals("KHONG")) {
                m--;
                gpa = sv[i].getGpa();
                if (m == 0) {
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (sv[i].getGpa() < gpa) {
                sv[i].setStatus("KHONG");
            }
        }
        for (int i = 0 ; i < n ; i++) {
            System.out.println(goc[i]);
        }
    }
}
