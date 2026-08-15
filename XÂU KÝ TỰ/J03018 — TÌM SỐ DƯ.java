import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int k = 0;
            if (n == 1) 
                k = s.charAt(0) - '0';
            else
                k = (s.charAt(n - 2) - '0') * 10 + (s.charAt(n - 1) - '0');
            if (k % 4 == 0) 
                System.out.println(4);
            else 
                System.out.println(0);
        }
    }
}
