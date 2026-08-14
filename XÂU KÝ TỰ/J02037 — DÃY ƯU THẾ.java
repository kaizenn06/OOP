import java.util.Scanner;

public class b24dccn186 {

    static boolean check(int[] a, int n) {
        int l, c;
        l = c = 0;
        for (int i = 0 ; i < n ; i++) {
            if (a[i] % 2 == 0) c++;
            else l++;
        }
        if (n % 2 == 0) return c > l;
        else return l > c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            while (t-- > 0) {
                String s = sc.nextLine();
                String[] x = s.split(" ");
                int[] a = new int[x.length];
                for (int i = 0 ; i < x.length ; i++) {
                    a[i] = Integer.parseInt(x[i]);
                }
                System.out.println(check(a, x.length) ? "YES" : "NO");
            }    
    }
}














