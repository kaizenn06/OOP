package J04014;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo c = a.add(b);
            c = c.mul(c);
            PhanSo d = a.mul(b).mul(c);
            c.rutgon();
            d.rutgon();
            System.out.println(c + " " + d);
        }
    }
}