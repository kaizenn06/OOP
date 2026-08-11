import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            boolean ok = true;
            for(int i = 0 ; i < s.length() - 1 ; i++) {
                if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1) {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
