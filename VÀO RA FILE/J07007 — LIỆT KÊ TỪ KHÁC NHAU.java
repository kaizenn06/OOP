import java.io.*;
import java.util.*;

public class b24dccn186 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()) {
            String x = sc.next();
            x = x.toLowerCase();
            if (!a.contains(x)) a.add(x);
        }
        Collections.sort(a);
        for (String x : a) {
            System.out.println(x);
        }
    }
}
