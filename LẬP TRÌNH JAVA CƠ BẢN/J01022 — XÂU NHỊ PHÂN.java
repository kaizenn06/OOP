import java.util.Scanner;

public class b24dccn186 {

    static long[] fibo = new long[94];

    static int solve(int n, long k) {
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k <= fibo[n - 2]) return solve(n - 2, k);
        else return solve(n - 1, k - fibo[n - 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibo[1] = 1; fibo[2] = 1;
        for(int i = 3 ; i <= 93 ; i++) fibo[i] = fibo[i - 1] + fibo[i - 2];
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(solve(n, k));
        }
    }
}
