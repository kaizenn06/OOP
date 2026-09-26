package J05015;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        CuaRow[] a = new CuaRow[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = new CuaRow(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(a[i]);
        }
    }
}
