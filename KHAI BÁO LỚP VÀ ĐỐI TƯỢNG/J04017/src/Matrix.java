package J04017;

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
    public Matrix trans() {
        Matrix that = new Matrix(this.m,this.n);
        for (int i = 0 ; i < this.n ; i++) {
            for (int j = 0 ; j < this.m ; j++) {
                that.a[j][i] = this.a[i][j];
            }
        }
        return that;
    }
    public Matrix mul(Matrix that) {
        Matrix res = new Matrix(this.n, this.n);
        for (int i = 0 ; i < this.n ; i++) {
            for (int j = 0 ; j < this.n ; j++) {
                res.a[i][j] = 0;
                for (int k = 0 ; k < this.m ; k++) {
                    res.a[i][j] += this.a[i][k] * that.a[k][j];
                }
            }
        }
        return res;
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                s.append(a[i][j]);
                s.append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
