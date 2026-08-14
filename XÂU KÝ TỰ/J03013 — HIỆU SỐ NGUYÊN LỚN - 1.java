import java.math.BigInteger;
import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger(); 
            int lena = a.toString().length();
            int lenb = b.toString().length();
            BigInteger c = a.subtract(b).abs();
            String s = c.toString();
            int max = Math.max(lena, lenb);
            while (s.length() < max) {
                s = "0" + s;
            }
            System.out.println(s);
        }
    }
}
