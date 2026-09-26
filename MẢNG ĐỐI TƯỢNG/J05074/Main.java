package J05074;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0 ; i < n ; i++) {
            sv[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Status[] stt = new Status[n];
        for (int i = 0 ; i < n ; i++) {
            String id = sc.next(), status = sc.next();
            SinhVien a = null;
            for (int j = 0 ; j < n ; j++) {
                if (sv[j].getId().equals(id)) {
                    a = sv[j];
                    break;
                }
            }
            stt[i] = new Status(id, status, a);
        }
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (sv[i].getId().equals(stt[j].getId())) {
                    System.out.println(stt[j]);
                    break;
                }
            }
        }
    }
}
