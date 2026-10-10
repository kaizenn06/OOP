import java.util.*;

public class J08011 {
    public static boolean check (Integer x) {
        String s = x.toString();
        for (int i = 0 ; i < s.length() - 1 ; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        while (sc.hasNext()) {
            Integer x = sc.nextInt();
            if (check(x)) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        for (Integer x : list) {
            System.out.println(x + " " + map.get(x));
        }
    }
}
