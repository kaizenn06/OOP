import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        for (int i = 0 ; i < n ; i++) {
            int d1 = 0, d2 = 0;
            for (int j = 0 ; j < 3 ; j++) {
                int x = sc.nextInt();
                if (x == 0) d1++;
                else d2++;
            }
            if (d2 > d1) d++;
        }
        System.out.println(d);
    }
}
