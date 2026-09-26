package J05003;

import java.util.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinhVien[] arr = new SinhVien[n + 1];
        for (int i = 1 ; i <= n ; i++) {
            sc.nextLine();
            arr[i] = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            System.out.println(arr[i]);
        }
    }
}
