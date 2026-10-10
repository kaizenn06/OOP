package J07019;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        int n = sc1.nextInt();
        SanPham[] sp = new SanPham[n];
        for (int i = 0 ; i < n ; i++) {
            sc1.nextLine();
            sp[i] = new SanPham(sc1.nextLine(), sc1.nextLine(), sc1.nextLong(), sc1.nextLong());
        }
        int m = sc2.nextInt();
        HoaDon[] hd = new HoaDon[m];
        for (int i = 0 ; i < m ; i++) {
            String id = sc2.next();
            long quantity = sc2.nextLong();
            SanPham a = null;
            for (int j = 0 ; j < n ; j++) {
                if (sp[j].getId().equals(id.substring(0, 2))) {
                    a = sp[j];
                }
            }
            hd[i] = new HoaDon(i + 1, id, quantity, a);
            System.out.println(hd[i]);
        }
    }
}
