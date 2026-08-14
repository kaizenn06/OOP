import java.util.Scanner;

public class b24dccn186 {

    static boolean check(String s) {
        for (int i = 0 ; i * i < s.length() ; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
            if (s.charAt(i) != '0' &&  s.charAt(i) != '2' && s.charAt(i) != '4' && s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
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
