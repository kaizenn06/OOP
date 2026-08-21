import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> res = new ArrayList<>();
        while (sc.hasNext()) {
            String t = "";
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            for (String x : a) {
                x = x.toLowerCase();
                if (x.equals("!") || x.equals(".") || x.equals("?")) {
                    t = t.trim() + x + " ";
                } else {
                    t += x + " ";
                }
            }
            t = t.trim();
            t = Character.toUpperCase(t.charAt(0)) + t.substring(1);
            if (t.charAt(t.length() - 1) >= 'a' && t.charAt(t.length() - 1) <= 'z') t += ".";
            res.add(t);
        }
        for (String x : res) {
            System.out.println(x);
        }
    }
}
