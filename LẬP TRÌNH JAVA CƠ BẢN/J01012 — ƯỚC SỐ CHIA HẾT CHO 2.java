import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int d = 0;
            for(int i = 2 ; i * i <= n ; i++) {
                if(n % i == 0) {
                    if(i % 2 == 0) d++;
                    if(n / i != i && n / i % 2 == 0) d++;
                }
            }
            if(n % 2 == 0) d++;
            System.out.println(d);
        }
    }
}
