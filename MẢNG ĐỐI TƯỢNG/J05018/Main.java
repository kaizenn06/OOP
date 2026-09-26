package J05018;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HocSinh[] hs = new HocSinh[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            hs[i] = new HocSinh(i + 1, sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(hs);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(hs[i]);
        }
    }
}
