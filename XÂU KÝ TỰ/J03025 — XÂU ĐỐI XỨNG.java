import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int d = 0;
            for (int i = 0 ; i < s.length() / 2 ; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) d++;
            }
            if (d == 0 && s.length() % 2 == 1) {
                System.out.println("YES");
            }
            else if (d == 1) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
