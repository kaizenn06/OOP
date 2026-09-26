package J05016;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        KhachHang[] kh = new KhachHang[n];
        for (int i = 0 ; i < n ; i++) {
            String name = sc.nextLine();
            int room = Integer.parseInt(sc.nextLine().trim());
            String checkin = sc.nextLine();
            String checkout = sc.nextLine();
            long toll = Long.parseLong(sc.nextLine().trim());
            kh[i] = new KhachHang(i + 1, name, room, checkin, checkout, toll);
        }
        Arrays.sort(kh);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(kh[i]);
        }
    }
}
