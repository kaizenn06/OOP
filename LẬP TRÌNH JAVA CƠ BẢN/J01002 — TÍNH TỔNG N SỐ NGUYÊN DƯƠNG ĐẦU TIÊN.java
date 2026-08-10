import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            if(n <= 0) {
                System.out.println(0);
                return;
            }
            System.out.println((long)n * (n + 1) / 2);
        }
    }
}
