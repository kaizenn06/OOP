import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0 ; i < m ; i++) {
            b[i] = sc.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (a[i] == b[j]) {
                    if(!res.contains(a[i])) {
                        res.add(a[i]);
                    }
                    break;
                }
            }
        }
        Collections.sort(res);
        for (int i = 0 ; i < res.size() ; i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}
