import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            TreeSet<Character> set = new TreeSet<>();
            for (int i = 0 ; i < s.length() ; i++) {
                set.add(s.charAt(i));
            }
            if (set.size() + k >= 26) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
