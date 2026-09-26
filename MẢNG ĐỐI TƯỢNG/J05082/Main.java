package J05082;

import java.util.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        KhachHang[] kh = new KhachHang[n];
        for (int i = 0 ; i < n ; i++) {
            kh[i] = new KhachHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(kh);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(kh[i]);
        }
    }
}
