import java.util.Scanner;

public class b24dccn186 {

    static long gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    static long lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(lcm(a,b) + " " + gcd(a,b));
        }
    }
}
