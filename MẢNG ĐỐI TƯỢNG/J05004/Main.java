package J05004;

import java.util.Scanner;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            sv[i] = new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            System.out.println(sv[i]);
        }
    }
}
