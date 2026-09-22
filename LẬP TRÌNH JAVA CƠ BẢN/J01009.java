import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = 1, sum = 0;
        for(int i = 1 ; i <= n ; i++) {
            t *= i;
            sum += t;
        }
        System.out.println(sum);
    }
}
