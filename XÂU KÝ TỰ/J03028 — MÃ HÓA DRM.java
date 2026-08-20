import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            String s1 = s.substring(0, n/2);
            String s2 = s.substring(n/2, n);
            int sum1 = 0, sum2 = 0;
            for (int i = 0 ; i < n/2 ; i++) {
                sum1 += s1.charAt(i) - 'A';
                sum2 += s2.charAt(i) - 'A';
            }
            String t1 = "", t2 = "";
            for (int i = 0 ; i < n/2 ; i++) {
                t1 += (char)((s1.charAt(i) - 'A' + sum1) % 26 + 'A');
                t2 += (char)((s2.charAt(i) - 'A' + sum2) % 26 + 'A');
            }
            String res = "";
            for (int i = 0 ; i < n/2 ; i++) {
                res += (char)((t1.charAt(i) - 'A' + t2.charAt(i) - 'A') % 26 + 'A');
            }
            System.out.println(res);
        }
    }
}
