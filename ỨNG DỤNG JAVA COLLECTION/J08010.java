import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J08010 {
    public static boolean check(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int max_length = 0;
        while (sc.hasNext()) {
            String x = sc.next();
            if (check(x)) {
                map.put(x, map.getOrDefault(x, 0) + 1);
                max_length = Math.max(max_length, x.length());
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().length() == max_length) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
