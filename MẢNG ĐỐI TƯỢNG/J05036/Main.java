package J05036;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MatHang[] mh = new MatHang[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            mh[i] = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            System.out.println(mh[i]);
        }
    }
}
