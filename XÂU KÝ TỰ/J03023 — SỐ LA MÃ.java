import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1); map.put('V', 5); map.put('X', 10);
        map.put('L', 50); map.put('C', 100); map.put('D', 500); map.put('M', 1000);
        while (t-- > 0) {
            int n = 0;
            String s = sc.next();
            for (int i = 0 ; i < s.length() - 1 ; i++) {
                if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                    n -= map.get(s.charAt(i));
                }
                else n += map.get(s.charAt(i));
            }
            n += map.get(s.charAt(s.length() - 1));
            System.out.println(n);
        }
    }
}
