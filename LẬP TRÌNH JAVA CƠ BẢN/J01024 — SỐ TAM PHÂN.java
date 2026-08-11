import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            boolean found = true;
            for (int i = 0 ; i < s.length() ; i++) {
                if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') {
                    found = false;
                    break;
                }
            }
            System.out.println(found == true ? "YES" : "NO");
        }   
    }
}
