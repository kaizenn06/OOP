package J05032;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        People[] a = new People[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = new People(sc.next(), sc.next());
        }
        Arrays.sort(a);
        System.out.println(a[a.length - 1] + "\n" + a[0]);
    }
}
