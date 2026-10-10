package J07011;

import java.util.*;
import java.io.*;

class Pair implements Comparable<Pair> {
    private String key;
    private Integer value;
    public Pair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public int compareTo(Pair that) {
        if (this.value != that.value) {
            return Integer.compare(that.value, this.value);
        }
        return this.key.compareTo(that.key);
    }
    @Override
    public String toString() {
        return key + " " + value;
    }
}

public class J07011 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Pair> result = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            String[] s = sc.nextLine().toLowerCase().split("\\W+");
            for (String x : s) {
                if (!x.isEmpty()) map.put(x, map.getOrDefault(x,0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(new Pair(entry.getKey(), entry.getValue()));
        }
        Collections.sort(result);
        for (Pair x : result) System.out.println(x);
    }
}
