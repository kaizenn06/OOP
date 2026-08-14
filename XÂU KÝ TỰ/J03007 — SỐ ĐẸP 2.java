import java.util.Scanner;

public class b24dccn186 {

    static boolean check(String s) {
        if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') return false;
        int sum = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
            sum += s.charAt(i) - '0';
        }
        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(check(s) ? "YES" : "NO");
        }
    }
}
