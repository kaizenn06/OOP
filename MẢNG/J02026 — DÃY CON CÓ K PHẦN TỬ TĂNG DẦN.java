import java.util.*;

public class b24dccn186 {
    static int t, n, k;
    static Integer[] a;
    static void Try(int i, List<Integer> s) {
        if (s.size() == k) {
            for (Integer x : s) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        for (int j = i ; j < n ; j++) {
            s.add(a[j]);
            Try(j + 1, s);
            s.remove(s.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            a = new Integer[n];
            for (int i = 0 ; i < n ; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Try(0, new ArrayList<>());
        }
    }
}
