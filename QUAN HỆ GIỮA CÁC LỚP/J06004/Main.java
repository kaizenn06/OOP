package J06004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        SinhVien[] sv = new SinhVien[n];
        BaiTL[] btl = new BaiTL[m];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            sv[i] = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        sc.nextLine();
        for (int i = 0 ; i < m ; i++) {
            btl[i] = new BaiTL(i + 1, sc.nextLine());
        }
        Arrays.sort(sv);
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (sv[i].getNhom() == j + 1) {
                    System.out.println(sv[i] + " " + btl[j].getTitle());
                    break;
                }
            }
        }
    }
}
