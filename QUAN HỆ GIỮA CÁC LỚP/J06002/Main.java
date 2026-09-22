package J06002;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> sp = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            long price_l1 = Long.parseLong(sc.nextLine());
            long price_l2 = Long.parseLong(sc.nextLine());
            sp.add(new SanPham(id, name, price_l1, price_l2));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> hd = new ArrayList<>();
        for (int i = 0 ; i < m ; i++) {
            String id = sc.next();
            int quantity = Integer.parseInt(sc.next());
            SanPham a = null;
            for (SanPham x : sp) {
                if (x.getId().equals(id.substring(0,2))) {
                    a = x;
                }
            }
            hd.add(new HoaDon(i + 1, id, quantity, a));
        }
        Collections.sort(hd);
        for (HoaDon a : hd) {
            System.out.println(a);
        }
    }
}
