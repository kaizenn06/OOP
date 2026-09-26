package J05008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Point[] p = new Point[n];
            for (int i = 0 ; i < n ; i++) {
                p[i] = new Point(sc.nextDouble(), sc.nextDouble());
            }
            double area = 0;
            for (int i = 0 ; i < n ; i++) {
                int j = (i + 1) % n;
                area += (p[i].getX() * p[j].getY() - p[j].getX() * p[i].getY());
            }
            System.out.printf("%.3f\n", Math.abs(area) / 2.0);
        }
    }
}
