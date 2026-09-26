package J05013;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ThiSinh[] a = new ThiSinh[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            a[i] = new ThiSinh(i + 1, sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(a);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(a[i]);
        }
    }
}
