import java.io.*;
import java.math.*;
import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        while (s.length() > 1) {
            int mid = s.length() / 2;
            String s1 = s.substring(0, mid);
            String s2 = s.substring(mid);
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            BigInteger sum = a.add(b);
            s = sum.toString();
            System.out.println(s);
        }
    }
}
