package J05057;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ThiSinh[] ts = new ThiSinh[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            ts[i] = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            System.out.println(ts[i]);
        }
    }
}
