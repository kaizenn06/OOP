package J05059;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ThiSinh[] ts = new ThiSinh[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            ts[i] = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        }
        int quantity = sc.nextInt();
        double score = 0;
        Arrays.sort(ts);
        for (int i = 0 ; i < n ; i++) {
            if (quantity > 0 || ts[i].getTotal() >= score) {
                ts[i].setStatus("TRUNG TUYEN");
                score = ts[i].getTotal();
                quantity--;
            }
            else ts[i].setStatus("TRUOT");
        }
        System.out.println(score);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(ts[i]);
        }
    }
}
