package J05035;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] a = new SinhVien[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String enterprise = sc.nextLine();
            for (int i = 0 ; i < n ; i++) {
                if (a[i].getEnterprise().equals(enterprise)) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
