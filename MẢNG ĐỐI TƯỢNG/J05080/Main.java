package J05080;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HocPhan[] hp = new HocPhan[n];
        for (int i = 0 ; i < n ; i++) {
            hp[i] = new HocPhan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(hp);
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < m ; i++) {
            String lecturer = sc.nextLine();
            for (int j = 0 ; j < n ; j++) {
                if (hp[j].getLecturer().equals(lecturer)) {
                    System.out.printf("Danh sach cho giang vien %s:\n", hp[j].getLecturer());
                    break;
                }
            }
            for (int j = 0 ; j < n ; j++) {
                if (hp[j].getLecturer().equals(lecturer)) {
                    System.out.println(hp[j]);
                }
            }
        }
    }
}
