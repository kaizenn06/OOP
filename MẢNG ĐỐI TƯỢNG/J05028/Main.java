package J05028;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DoanhNghiep[] dn = new DoanhNghiep[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            dn[i] = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        Arrays.sort(dn);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(dn[i]);
        }
    }
}
