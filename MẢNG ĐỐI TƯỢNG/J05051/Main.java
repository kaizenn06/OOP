package J05051;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        KhachHang[] kh = new KhachHang[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            kh[i] = new KhachHang(i + 1, sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(kh);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(kh[i]);
        }
    }
}
