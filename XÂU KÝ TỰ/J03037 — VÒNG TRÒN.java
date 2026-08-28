import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int d = 0;
        for (char c = 'A' ; c <= 'Z' ; c++) {
            int left = -1, right = 0;
            for (int i = 0 ; i < s.length() ; i++) {
                if (c == s.charAt(i)) {
                    if (left == -1) left = i;
                    else right = i;
                }
            }
            int[] dem = new int[260];
            for (int j = left + 1 ; j < right ; j++) {
                dem[s.charAt(j)]++;
            }
            for (int j = c + 1 ; j <= 'Z' ; j++) {
                if (dem[j] == 1) d++;
            }
        }
        System.out.println(d);
    }
}
