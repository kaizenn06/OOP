package J04021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        J04021.IntSet s1 = new J04021.IntSet(a);
        J04021.IntSet s2 = new J04021.IntSet(b);
        J04021.IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}