import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1 ; i <= t ; i++) {
            System.out.println("Test " + i + ":");
            int n = sc.nextInt();
            int[] a = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0 ; j < n ; j++) {
                a[j] = sc.nextInt();
                map.put(a[j], map.getOrDefault(a[j], 0) + 1);
            }
            for (int j = 0 ; j < n ; j++) {
                if (map.get(a[j]) > 0) {
                    System.out.println(a[j] + " xuat hien " + map.get(a[j]) + " lan ");
                    map.put(a[j], 0);
                }
            }
            System.out.println();
        }
    }
}
