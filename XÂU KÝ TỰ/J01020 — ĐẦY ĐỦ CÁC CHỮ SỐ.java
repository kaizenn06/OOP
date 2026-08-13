import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("Impossible");
                continue;
            }
            boolean[] check = new boolean[10];
            int count = 0, k = n;
            while (true) {
                int x = k;
                while (x > 0) {
                    int digit = x % 10;
                    if (!check[digit]) {
                        check[digit] = true;
                        count++;
                    }
                    x /= 10;
                }
                if (count == 10) {
                    System.out.println(k);
                    break;
                }
                k += n;
            }
        }
    }
}
