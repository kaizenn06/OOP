import java.util.Scanner;

public class J01002 {
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
