package J07058;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        MonHoc[] a = new MonHoc[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for (int i = 0 ; i < n ; i++) {
            System.out.println(a[i]);
        }
    }
}
