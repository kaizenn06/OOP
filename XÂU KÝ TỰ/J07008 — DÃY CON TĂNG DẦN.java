import java.io.*;
import java.util.*;

public class b24dccn186 {
    static int n;
    static int[] a;
    static ArrayList<String> res;
    static boolean check(ArrayList<Integer> s) {
        for (int j = 0 ; j < s.size() - 1 ; j++) {
            if (s.get(j) > s.get(j + 1)) return false; 
        }
        return true;
    }
    static void Try(int i, ArrayList<Integer> s) {
        if (s.size() > 1 && check(s)) {
            StringBuilder arr = new StringBuilder();
            for (int x : s) {
                arr.append(x).append(" ");
            }
            res.add(arr.toString());
        }
        for (int j = i ; j < n ; j++) {
            s.add(a[j]);
            Try(j + 1, s);
            s.remove(s.size() - 1);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        res = new ArrayList<>();
        Try(0, new ArrayList<>());
        Collections.sort(res);
        for (String x : res) {
            System.out.println(x);
        }
    }
}
