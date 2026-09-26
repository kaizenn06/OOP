package J05064;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GiaoVien[] gv = new GiaoVien[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            gv[i] = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        int ht = 0, hp = 0;
        for (int i = 0 ; i < n ; i++) {
            if (gv[i].getId().substring(0, 2).equals("HT")) {
                if (ht == 1) continue;
                ht++;
            }
            else if (gv[i].getId().substring(0, 2).equals("HP")) {
                if (hp == 2) continue;
                hp++;
            }
            System.out.println(gv[i]);
        }
    }
}
