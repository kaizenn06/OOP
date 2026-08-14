import java.math.*;
import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger n = sc.nextBigInteger();
            System.out.println(n.mod(BigInteger.valueOf(11)).compareTo(BigInteger.ZERO) == 0 ? 1 : 0);
        }
    }
}
