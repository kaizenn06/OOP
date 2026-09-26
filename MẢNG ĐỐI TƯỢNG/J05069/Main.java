package J05069;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Squad[] sq = new Squad[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            sq[i] = new Squad(sc.nextLine(), sc.nextLine(), sc.nextLong());
        }
        int m = sc.nextInt();
        Infor[] infors = new Infor[m];
        for (int i = 0 ; i < m ; i++) {
            String id = sc.next();
            long price = sc.nextLong();
            Squad a = null;
            for (int j = 0 ; j < n ; j++) {
                if (sq[j].getId().equals(id.substring(1,3))) {
                    a = sq[j];
                    break;
                }
            }
            infors[i] = new Infor(id, a, price);
            System.out.println(infors[i]);
        }
    }
}
