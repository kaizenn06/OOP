package J05017;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        KhachHang[] kh = new KhachHang[n];
        for (int i = 0 ; i < n ; i++) {
            String name = sc.nextLine();
            int oldVal = Integer.parseInt(sc.nextLine().trim());
            int newVal = Integer.parseInt(sc.nextLine().trim());
            kh[i] = new KhachHang(i + 1, name, oldVal, newVal);
        }
        Arrays.sort(kh);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(kh[i]);
        }
    }
}
