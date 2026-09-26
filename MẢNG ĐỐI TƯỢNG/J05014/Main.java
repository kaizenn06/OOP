package J05014;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GiaoVien[] gv = new GiaoVien[n];;
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            gv[i] = new GiaoVien(i + 1, sc.nextLine(), sc.next(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(gv);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(gv[i]);
        }
    }
}
