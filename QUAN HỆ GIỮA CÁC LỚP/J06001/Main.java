package J06001;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> sp = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            long l1 = Long.parseLong(sc.nextLine());
            long l2 = Long.parseLong(sc.nextLine());
            sp.add(new SanPham(id, name, l1, l2));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> hd = new ArrayList<>();
        for (int i = 0 ; i < m ; i++) {
            String id = sc.next();
            int sl = Integer.parseInt(sc.next());
            SanPham a = null;
            for (SanPham x : sp) {
                if (x.getId().equals(id.substring(0,2))) {
                    a = x;
                    break;
                }
            }
            hd.add(new HoaDon(i + 1, id, sl, a));
        }
        for (HoaDon x : hd) System.out.println(x);
    }
}
