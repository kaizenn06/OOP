package J04004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p1 = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo p2 = new PhanSo(sc.nextLong(), sc.nextLong());
        System.out.print(p1.add(p2));
    }
}
