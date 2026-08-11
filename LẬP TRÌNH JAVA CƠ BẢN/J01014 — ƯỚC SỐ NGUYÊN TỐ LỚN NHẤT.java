import java.util.Scanner;

public class b24dccn186 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >   0) {
            long n = sc.nextLong();
            long ans = 1;
            for(long i = 2 ; i * i <= n ; i++) {
                while(n % i == 0) {
                    ans = i;
                    n /= i;
                }
            }
            if(n > 1) ans = n;
            System.out.println(ans);
        }
    }
}
