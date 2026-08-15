import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String key = "22233344455566677778889999";
        while (t-- > 0) {
            String s = sc.next();
            s = s.toLowerCase();
            String n = "";
            for (int i = 0 ; i < s.length() ; i++) {
                n += key.charAt(s.charAt(i) - 'a');
            }
            boolean ok = true;
            for (int i = 0 ; i * i < n.length() ; i++) {
                if (n.charAt(i) != n.charAt(n.length() - i - 1)) {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
