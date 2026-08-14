import java.util.Scanner;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] a = s.trim().split(" +");
            String res = "";
            for (int i = 0 ; i < a.length ; i++) {
                String x = a[i];
                x = x.toLowerCase();
                x = Character.toUpperCase(x.charAt(0)) + x.substring(1);
                a[i] = x;
            }
            for (int i = 0 ; i < a.length ; i++) {
                System.out.printf("%s ", a[i]);
            }
            System.out.println();
        }
    }
}
