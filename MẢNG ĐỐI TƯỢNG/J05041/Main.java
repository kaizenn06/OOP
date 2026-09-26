package J05041;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NhanVien[] nv = new NhanVien[n];
        for (int i = 0 ; i < n ; i++) {
            nv[i] = new NhanVien(i + 1, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine());
        }
        Arrays.sort(nv);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(nv[i]);
        }
    }
}
