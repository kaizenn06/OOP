package J05073;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Order[] o = new Order[n];
        for (int i = 0 ; i < n ; i++) {
            o[i] = new Order(sc.next(), sc.nextInt(), sc.nextInt());
            System.out.println(o[i]);
        }
    }
}
