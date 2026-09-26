package J05038;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NhanVien[] nv = new NhanVien[n];
        long total_salary = 0;
        for (int i = 0 ; i < n ; i++) {
            nv[i] = new NhanVien(i + 1, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine());
            total_salary += nv[i].getSalary_total();
            System.out.println(nv[i]);
        }
        System.out.printf("Tong chi phi tien luong: %d", total_salary);
    }
}
