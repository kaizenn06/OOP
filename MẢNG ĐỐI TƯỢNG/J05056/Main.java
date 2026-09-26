package J05056;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Athlete[] a = new Athlete[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = new Athlete(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for (int i = 0 ; i < n ; i++) {
            if (i > 0 && a[i].getTt_s().equals(a[i - 1].getTt_s())) {
                a[i].SetRank(a[i - 1].getRank());
            }
            else a[i].SetRank(i + 1);
            System.out.println(a[i]);
        }
    }
}
