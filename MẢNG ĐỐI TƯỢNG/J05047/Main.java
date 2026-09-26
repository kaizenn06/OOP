package J05047;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LoHang[] lh = new LoHang[n];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0 ; i < n ; i++) {
            String s = sc.nextLine();
            String[] name = s.trim().split("\\s+");
            String name_lh = "" + Character.toUpperCase(name[0].charAt(0)) + Character.toUpperCase(name[1].charAt(0));
            map.put(name_lh, map.getOrDefault(name_lh, 0) + 1);
            int quantity = Integer.parseInt(sc.nextLine());
            long price = Long.parseLong(sc.nextLine());
            lh[i] = new LoHang(name_lh + "0" + map.get(name_lh), s, quantity, price);
        }
        Arrays.sort(lh);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(lh[i]);
        }
    }
}
