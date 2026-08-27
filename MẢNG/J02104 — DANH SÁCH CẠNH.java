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
        ArrayList<Pair> a = new ArrayList<>();
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= n ; j++) {
                int x = sc.nextInt();
                if (x == 1 && j > i) {
                    a.add(new Pair(i, j));
                }
            }
        }
        for (Pair x : a) {
            System.out.printf("(%d,%d)\n", x.first, x.second);
        }
    }
}
