package J05054;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HocSinh[] hs = new HocSinh[n];
        HocSinh[] goc = new HocSinh[n];
        for (int i = 0 ; i < n ; i++) {
            goc[i] = new HocSinh(i + 1, sc.nextLine(), Double.parseDouble(sc.nextLine()));
            hs[i] = goc[i];
        }
        Arrays.sort(hs);
        for (int i = 0 ; i < n ; i++) {
            if (i > 0 && hs[i].getAvg() == hs[i - 1].getAvg()) {
                hs[i].setRank(hs[i - 1].getRank());
            }
            else hs[i].setRank(i + 1);
        }
        for (int i = 0 ; i < n ; i++) {
            System.out.println(goc[i]);
        }
    }
}
