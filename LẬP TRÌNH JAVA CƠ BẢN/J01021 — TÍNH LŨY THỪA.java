import java.util.Scanner;

public class b24dccn186 {

    static final long MOD = 1000000007;

    static long power(long a, long b) {
        if (b == 0) return 1;
        long t = power(a, b/2);
        if (b % 2 == 0) return (t % MOD * t % MOD) % MOD;
        else return ((t % MOD * t % MOD) % MOD * a) % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        while (true) {
            a = sc.nextLong();
            b = sc.nextLong();
            if (a == 0 && b == 0) break;
            System.out.println(power(a, b));
        }
    }
}
