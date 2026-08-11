import java.util.Scanner;

public class b24dccn186 {

    static int[] prime = new int[2000005];

    static void sieve() {
        for(int i = 0 ; i <= 2000000 ; i++) prime[i] = i;
        for(int i = 2 ; i <= Math.sqrt(2000000) ; i++) {
            if(prime[i] == i) {
                for(int j = i * i ; j <= 2000000 ; j += i) {
                    if(prime[j] == j) prime[j] = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve();
        int n = sc.nextInt();
        long sum = 0;
        while(n-- > 0) {
            int x = sc.nextInt();
            while(x > 1) {
                sum += prime[x];
                x /= prime[x];
            }
        }
        System.out.print(sum);
    }
}
