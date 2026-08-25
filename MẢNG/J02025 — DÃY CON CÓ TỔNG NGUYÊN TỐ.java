import java.util.*;

public class b24dccn186 {
    static int t, n;
    static Integer[] a;
    static ArrayList<List<Integer>> res;
    static boolean isPrime(int n) {
        for (int i = 2 ; i * i <= n ; i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }
    static void Try(int i, int sum, List<Integer> s) {
        if (isPrime(sum)) {
            res.add(new ArrayList<>(s));
        }
        for (int j = n - 1 ; j >= i ; j--) {
            s.add(a[j]);
            Try(j + 1, sum + a[j], s);
            s.remove(s.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            a = new Integer[n];
            for (int i = 0 ; i < n ; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, Collections.reverseOrder());
            res = new ArrayList<>();
            Try(0, 0, new ArrayList<>());
            for (List<Integer> x : res) {
                for (Integer y : x) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }
        }
    }
}
