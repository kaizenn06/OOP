import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b = sc.nextInt();
        if (b == 0) {
            System.out.println("VSN");
            return;
        }
        if (a == 0 && b != 0) {
            System.out.println("VN");
            return;
        }
        System.out.printf("%.2f", -b /a);
    }
}
