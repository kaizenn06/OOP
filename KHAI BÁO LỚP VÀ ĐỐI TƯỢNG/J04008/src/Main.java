package J04008;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            double ab = p1.distance(p2);
            double ac = p1.distance(p3);
            double bc = p2.distance(p3);
            if (ab + ac > bc && ab + bc > ac && ac + bc > ab) {
                System.out.printf("%.3f\n", ab + ac + bc);
            }
            else System.out.println("INVALID");
        }
    }
}