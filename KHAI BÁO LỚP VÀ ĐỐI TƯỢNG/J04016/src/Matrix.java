package J04016;

import java.util.Scanner;

public class Matrix {
    private int n, m;
    private int[][] a;
    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }
    public void nextMatrix(Scanner sc) {
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix mul(Matrix b) {
        Matrix res = new Matrix(this.n, b.m);
        for (int i = 0 ; i < this.n ; i++) {
            for (int j = 0 ; j < b.m ; j++) {
                res.a[i][j] = 0;
                for (int k = 0 ; k < this.m ; k++) {
                    res.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return res;
    }
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                res.append(a[i][j]);
                res.append(" ");
            }
            res.append("\n");
        }
        return res.toString();
    }
}
