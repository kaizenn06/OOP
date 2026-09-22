package J06008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MonHoc[] mh = new MonHoc[n];
        for (int i = 0 ; i < n ; i++) {
            mh[i] = new MonHoc(sc.next(), sc.nextLine());
        }
        int m = Integer.parseInt(sc.nextLine());
        GiangVien[] gv = new GiangVien[m];
        for (int i = 0 ; i < m ; i++) {
            gv[i] = new GiangVien(sc.next(), sc.nextLine());
        }
        int k = sc.nextInt();
        HocPhan[] hp = new HocPhan[k];
        for (int i = 0 ; i < k ; i++) {
            String id_gv = sc.next();
            String id_mh = sc.next();
            Double total_time = Double.parseDouble(sc.nextLine());
            MonHoc a = null;
            for (int j = 0 ; j < n ; j++) {
                if (mh[j].getId().equals(id_mh)) {
                    a = mh[j];
                    break;
                }
            }
            GiangVien b = null;
            for (int j = 0 ; j < m ; j++) {
                if (gv[j].getId().equals(id_gv)) {
                    b = gv[j];
                    break;
                }
            }
            hp[i] = new HocPhan(id_gv, id_mh, total_time, a, b);
        }
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < k ; j++) {
                if (hp[j].getId_gv().equals(gv[i].getId())) {
                    gv[i].addTotal_time(hp[j].getTotal_time());
                }
            }
        }
        String x = sc.next();
        int idx = 0;
        for (int i = 0 ; i < m ; i++) {
            if (gv[i].getId().equals(x)) {
                idx = i;
                System.out.printf("Giang vien: %s\n", gv[i].getName());
                break;
            }
        }
        for (int i = 0 ; i < k ; i++) {
            if (hp[i].getGv().getId().equals(x)) {
                System.out.println(hp[i]);
            }
        }
        System.out.printf("Tong: %.2f", gv[idx].getTotal_time());
    }
}
