package J05044;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NhanVien[] nv = new NhanVien[n];
        for (int i = 0 ; i < n ; i++) {
            nv[i] = new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        }
        String argency = sc.nextLine();
        for (int i = 0 ; i < n ; i++) {
            if (nv[i].getArgency().equals(argency)) {
                System.out.println(nv[i]);
            }
        }
    }
}
