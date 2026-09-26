package J05009;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double thukhoa = 0;
        ThiSinh[] ts = new ThiSinh[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            ts[i] = new ThiSinh(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            thukhoa = Math.max(thukhoa, ts[i].getTotal());
        }
        for (int i = 0 ; i < n ; i++) {
            if (ts[i].getTotal() == thukhoa) {
                System.out.println(ts[i]);
            }
        }
    }
}
