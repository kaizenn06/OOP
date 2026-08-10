import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1 ; i <= t ; i++) {
            System.out.printf("Test %d: ", i);
            int n = sc.nextInt();
            for(int j = 2 ; j * j <= n ; j++) {
                if(n % j == 0) {
                    int d = 0;
                    while(n % j == 0) {
                        d++;
                        n /= j;
                    }
                    System.out.printf("%d(%d) ", j, d);
                }
            }
            if(n > 1) {
                System.out.printf("%d(%d) ", n, 1);
            }
            System.out.println();
        }
    }
}
