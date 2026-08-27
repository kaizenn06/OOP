import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n * n];
        for (int i = 0 ; i < n * n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Integer[][] matrix = new Integer[n][n];
        int x = 0;
        int row1 = 0, row2 = n - 1, col1 = 0, col2 = n - 1;
        while (row1 <= row2 && col1 <= col2) {
            for (int i = col1 ; i <= col2 ; i++) {
                matrix[row1][i] = a[x++];
            }
            row1++;
            for (int i = row1 ; i <= row2 ; i++) {
                matrix[i][col2] = a[x++];
            }
            col2--;
            for (int i = col2 ; i >= col1 ; i--) {
                matrix[row2][i] = a[x++];
            }
            row2--;
            for (int i = row2 ; i >= row1 ; i--) {
                matrix[i][col1] = a[x++];
            }
            col1++;
        }
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
