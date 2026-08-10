import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] a = new long[93];
        a[0] = 0; a[1] = 1;
        for(int i = 2 ; i <= 92 ; i++) {
            a[i]= a[i - 1] + a[i - 2];
        }
        while (t-- > 0) {
            long n = sc.nextLong();
            boolean ok = false;
            for(int i = 0 ; i < 93 ; i++) {
                if(n == a[i]) {
                    ok = true;
                }
            }
        System.out.println(ok ? "YES" : "NO");
        }
    }
}
