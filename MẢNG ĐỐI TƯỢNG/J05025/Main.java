package J05025;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        GiangVien[] gv = new GiangVien[n];
        for (int i = 0 ; i < n ; i++) {
            gv[i] = new GiangVien(i + 1, sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(gv);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(gv[i]);
        }
    }
}
