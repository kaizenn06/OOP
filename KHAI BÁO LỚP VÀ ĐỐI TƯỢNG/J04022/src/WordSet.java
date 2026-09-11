package J04022;

import java.util.TreeSet;

public class WordSet {
    private String arr;
    public WordSet(String arr) {
        this.arr = arr;
    }
    public WordSet union(WordSet a) {
        String[] s1 = this.arr.trim().toLowerCase().split("\\s+");
        String[] s2 = a.arr.trim().toLowerCase().split("\\s+");
        TreeSet<String> set = new TreeSet<>();
        for (String x : s1) set.add(x);
        for (String x : s2) set.add(x);
        StringBuilder res = new StringBuilder();
        for (String x : set) res.append(x).append(" ");
        return new WordSet(res.toString());
    }
    public WordSet intersection(WordSet a) {
        String[] s1 = arr.trim().toLowerCase().split("\\s+");
        String[] s2 = a.arr.trim().toLowerCase().split("\\s+");
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();
        for (String x : s1) set1.add(x);
        for (String x : s2) set2.add(x);
        StringBuilder res = new StringBuilder();
        for (String x : set1) {
            if (set2.contains(x)) {
                res.append(x).append(" ");
            }
        }
        return new WordSet(res.toString());
    }
    @Override
    public String toString() {
        return this.arr;
    }
}

