package J06007;

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
            hp[i] = new HocPhan(sc.next(), sc.next(), sc.nextDouble());
        }
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < k ; j++) {
                if (hp[j].getId_gv().equals(gv[i].getId())) {
                    gv[i].addTotal_time(hp[j].getTotal_time());
                }
            }
            System.out.println(gv[i]);
        }
    }
}
