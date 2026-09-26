package J05011;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Gamer[] a = new Gamer[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = new Gamer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(a[i]);
        }
    }
}
