package J05010;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MatHang[] m = new MatHang[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            m[i] = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(m);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(m[i]);
        }
    }
}
