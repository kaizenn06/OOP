import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length(), i = 0;
        while (i < n) {
            int end = 0;
            char max = 'a';
            for (int j = i ; j < n ; j++) {
                if (s.charAt(j) >= max) {
                    max = s.charAt(j);
                    end = j;
                }
            }
            for (int j = i ; j <= end ; j++) {
                if (s.charAt(j) == max) {
                    System.out.print(max);
                }
            }
            i = end + 1;
        }
    }
}
