package J05043;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NhanVien[] nv = new NhanVien[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            nv[i] = new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            System.out.println(nv[i]);
        }
    }
}
