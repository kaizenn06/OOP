import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> res = new ArrayList<>();
        String t = "";
        while (sc.hasNext()) {
            String s = sc.next();
            s = s.toLowerCase();
            t += s + " ";
            if (s.charAt(s.length() - 1) == '.' || s.charAt(s.length() - 1) == '!' || s.charAt(s.length() - 1) == '?') {
                t = Character.toUpperCase(t.charAt(0)) + t.substring(1, t.length() - 2);
                res.add(t);
                t = "";
            }
        }
        for (String x : res) {
            System.out.println(x);
        }
    }
}
