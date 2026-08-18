import java.util.*;

public class b24dccn186 {
    static class Pair {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] a = new Pair[n];
        for (int i = 0 ; i < n ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[i] = new Pair(x, y);
        }
        Arrays.sort(a, (p1, p2) -> Integer.compare(p1.first, p2.first));
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            sum = Math.max(sum, a[i].first) + a[i].second;
        }
        System.out.println(sum);
    }
}
