package J05005;

import java.util.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> sv = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            sv.add(new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        Collections.sort(sv);
        for(SinhVien x : sv) {
            System.out.println(x);
        }
    }
}
