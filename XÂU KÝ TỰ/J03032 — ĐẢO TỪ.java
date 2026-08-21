import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            for (int i = 0 ; i < a.length ; i++) {
                a[i] =  new StringBuilder(a[i]).reverse().toString();
            }
            System.out.println(String.join(" ", a));
        }
    }
}
