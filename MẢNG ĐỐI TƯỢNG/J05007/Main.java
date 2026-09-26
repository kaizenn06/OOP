package J05007;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NhanVien[] nv = new NhanVien[n];
        for (int i = 0 ; i < n ; i++) {
            nv[i] = new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(nv);
        for(NhanVien x : nv) {
            System.out.println(x);
        }
    }
}
