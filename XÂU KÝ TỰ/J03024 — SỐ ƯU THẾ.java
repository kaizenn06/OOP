import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            int chan = 0;
            int le = 0;
            boolean ok = true;
            for (int i = 0 ; i < n.length() ; i++) {
                if (n.charAt(i) >= '0' && n.charAt(i) <= '9') {
                    if ((n.charAt(i) - '0') % 2 == 1) le++;
                    else chan++;
                }
                else {
                    ok = false;
                    break;
                }
            }
            if (!ok) System.out.println("INVALID");
            else if (le < chan && n.length() % 2 == 0) {
                System.out.println("YES");
            }
            else if (le > chan && n.length() % 2 == 1) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
