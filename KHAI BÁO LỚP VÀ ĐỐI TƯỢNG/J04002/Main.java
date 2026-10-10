package J04002;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        if (w <= 0 || h <= 0) {
            System.out.println("INVALID");
            return;
        }
        Rectange a = new Rectange(w, h, sc.next());
        System.out.println((int)a.findPerimeter() + " " + (int)a.findArea() + " " + a.getColor());
    }
}