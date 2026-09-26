package J05049;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MaHang[] a = new MaHang[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = new MaHang(sc.nextLine(), Long.parseLong(sc.nextLine()));
        }
        Arrays.sort(a);
        String key = sc.next();
        for (int i = 0 ; i < n ; i++) {
            if (a[i].getId().contains(key)) {
                System.out.println(a[i]);
            }
        }
    }
}
