package J05021;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> sv = new ArrayList<>();
        while (sc.hasNextLine()) {
            sv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(sv);
        for (SinhVien x : sv) {
            System.out.println(x);
        }
    }
}
