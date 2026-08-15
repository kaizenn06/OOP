import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLen = 0;
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        while(sc.hasNext()) {
            String s = sc.next();
            int n = s.length();
            boolean ok = true;
            for (int i = 0 ; i < n ; i++) {
                if (s.charAt(i) != s.charAt(n - i - 1)) {
                    ok = false;
                    break;
                }
            }
            if(!ok) continue;
            map.put(s, map.getOrDefault(s, 0) + 1);
            if (n > maxLen) {
                maxLen = n;
                list.clear();
                list.add(s);
            }
            else if (n == maxLen) {
                if (!list.contains(s)) {
                    list.add(s);
                }
            }
        }
        for (String s : list) {
            System.out.println(s + " " + map.get(s));
        }
    }
}
