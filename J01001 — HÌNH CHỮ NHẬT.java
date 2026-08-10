import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.print(0);
            return;
        }
        System.out.printf("%d %d", 2 * (a + b), a * b);
    }
}
