package J05079;

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
        for (int i = 0 ; i < m ; i++) {
            String id = sc.next();
            for (int j = 0 ; j < n ; j++) {
                if (hp[j].getId().equals(id)) {
                    System.out.printf("Danh sach nhom lop mon %s:\n", hp[j].getName());
                    break;
                }
            }
            for (int j = 0 ; j < n ; j++) {
                if (hp[j].getId().equals(id)) {
                    System.out.println(hp[j]);
                }
            }
        }
    }
}
