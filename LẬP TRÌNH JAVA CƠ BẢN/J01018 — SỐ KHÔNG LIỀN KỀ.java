import java.util.Scanner;

public class b24dccn186 {

    static int check(String n) {
        for(int i = 0 ; i < n.length() - 1 ; i++) {
            if(Math.abs(n.charAt(i) - n.charAt(i + 1)) != 2) return 0;
        }
        return 1;
    }

    static int tong(String n) {
        int sum = 0;
        for(int i = 0 ; i < n.length() ; i++) {
            sum += (int)n.charAt(i) - '0';
        }
        return sum % 10;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String n = sc.next();
            System.out.println((check(n) == 1 && tong(n) == 0) ? "YES" : "NO");
        }
    }
}
