import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] res = new String[n];
        for (int i = 0 ; i < n ; i++) {
            res[i] = sc.next();
        }
        int min = Integer.MAX_VALUE;
        String taget = res[0];
        for (int step = 0 ; step < taget.length() ; step++) {
            boolean all = true;
            int d = 0;
            for (int i = 0 ; i < n ; i++) {
                String s = res[i];
                boolean ok = false;
                for (int j = 0 ; j < s.length() ; j++) {
                    if (s.equals(taget)) {
                        ok = true;
                        d += j;
                        break;
                    }
                    s = s.substring(1) + s.charAt(0);
                }
                if (!ok) {
                    all = false;
                    break;
                }
            }
            if (all) {
                min = Math.min(min, d);
            }
            taget = taget.substring(1) + taget.charAt(0);
        }
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
}
