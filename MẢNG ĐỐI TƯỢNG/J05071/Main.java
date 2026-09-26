package J05071;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Country[] ct = new Country[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            ct[i] = new Country(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        int m = sc.nextInt();
        Call[] calls = new Call[m];
        for (int i = 0 ; i < m ; i++) {
            String id = sc.next();
            String start_time = sc.next();
            String end_time = sc.next();
            Country a = null;
            if (id.charAt(0) != '0') a = new Country(null, "Noi mang", 800);
            for (int j = 0 ; j < n ; j++) {
                if (id.charAt(0) != '0') break;
                if (ct[j].getId().equals(id.substring(1, 3))) {
                    a = ct[j];
                    break;
                }
            }
            calls[i] = new Call(id, start_time, end_time, a);
            System.out.println(calls[i]);
        }
    }
}
