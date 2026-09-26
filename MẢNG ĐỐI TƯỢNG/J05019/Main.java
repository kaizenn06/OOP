package J05019;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Rainy> a = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            int id = i + 1;
            String name = sc.nextLine();
            String time_start = sc.nextLine();
            String time_end = sc.nextLine();
            double rain_total = sc.nextDouble();
            Rainy now = null;
            for (Rainy x : a) {
                if (x.getName().equals(name)) {
                    now = x;
                    break;
                }
            }
            if (now == null) {
                now = new Rainy(a.size() + 1, name);
                a.add(now);
            }
            now.add(time_start, time_end, rain_total);
        }
        for (Rainy x : a) {
            System.out.println(x);
        }
    }
}
