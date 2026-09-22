import java.util.Scanner;

public class J01026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sqrt = (int)Math.sqrt(n);
            System.out.println(sqrt * sqrt == n ? "YES" : "NO");
        }
    }
}
