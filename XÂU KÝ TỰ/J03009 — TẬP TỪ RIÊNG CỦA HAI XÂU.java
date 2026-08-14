import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String x1 = sc.nextLine();
            String x2 = sc.nextLine();
            String[] s1 = x1.split(" ");
            String[] s2 = x2.split(" ");
            Set<String> set = new TreeSet<>();
            for (int i = 0 ; i < s1.length ; i++) {
                boolean ok = true;
                for (int j = 0 ; j < s2.length ; j++) {
                    if (s1[i].equals(s2[j])) {
                        ok = false;
                        break;
                    }
                }
                if (ok) set.add(s1[i]);
            }
            /* dung cach nay cx dc 
            Set<String> a = new TreeSet<>(Arrays.asList(s1));
            Set<String> b = new HashSet<>(Arrays.asList(s2));
            a.removeAll(b);
            */
            for (String s : set) {
                System.out.printf("%s ", s);
            }
            System.out.println();
        }
    }
}
