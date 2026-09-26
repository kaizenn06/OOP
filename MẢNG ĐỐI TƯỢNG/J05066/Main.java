package J05066;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NhanVien[] nv = new NhanVien[n];
        for (int i = 0 ; i < n ; i++) {
            nv[i] = new NhanVien(sc.next(), sc.nextLine());
        }
        int gd = 0, tp = 0, pp = 0;
        for (int i = 0 ; i < n ; i++) {
            if (nv[i].getCv().equals("GD")) {
                if (gd == 1) nv[i].setCv("NV");
                else gd++;
            }
            else if (nv[i].getCv().equals("TP")) {
                if (tp == 3) nv[i].setCv("NV");
                else tp++;
            }
            else if (nv[i].getCv().equals("PP")) {
                if (pp == 3) nv[i].setCv("NV");
                else pp++;
            }
        }
        Arrays.sort(nv);
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String key = sc.nextLine().toLowerCase();
            for (int i = 0 ; i < n ; i++) {
                if (nv[i].getName().toLowerCase().contains(key)) {
                    System.out.println(nv[i]);
                }
            }
            System.out.println();
        }
    }
}
