import java.util.Scanner;

public class b24dccn186 {

    static int dem(int i, String a) {
        int d = 0;
        for (int j = i ; j < a.length() ; j++) {
            if (a.charAt(j) == '?') d++;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String a = sc.next();
            String b = sc.next();
            int count = 0;
            int ans = 0;
            for (int i = 0 ; i < a.length() ; i++) {
                if (a.charAt(i) == '?') {
                    int t = b.charAt(i) - '0';
                    count = 9 - t;
                    if (i == 0 && t == 0) count = 9;
                    ans += count * Math.pow(10, dem(i + 1, a));
                }
                else {
                    int x = a.charAt(i) - '0';
                    int y = b.charAt(i) - '0';
                    if (x > y) {
                        ans += Math.pow(10, dem(i + 1, a));
                        break;
                    }
                    else if (x < y) break;
                }
            }
            System.out.println(ans);
        }
    }
}
