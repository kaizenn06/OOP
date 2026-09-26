package J05060;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PhuHo[] ph = new PhuHo[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            ph[i] = new PhuHo(i + 1, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            System.out.println(ph[i]);
        }
    }
}
