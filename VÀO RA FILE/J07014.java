import java.util.*;
import java.io.*;

class WordSet {
    private Set<String> words;
    public WordSet(TreeSet<String> words) {
        this.words = words;
    }
    public WordSet (String file) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(file));
        words = new TreeSet<>();
        while (sc.hasNext()) {
            words.add(sc.next().toLowerCase());
        }
    }
    public WordSet union(WordSet that) {
        TreeSet<String> set = new TreeSet<>();
        for (String x : this.words) set.add(x);
        for (String x : that.words) set.add(x);
        return new WordSet(set);
    }
    public WordSet intersection(WordSet that) {
        TreeSet<String> set = new TreeSet<>();
        for (String x : this.words) {
            if (that.words.contains(x)) {
                set.add(x);
            }
        }
        return new WordSet(set);
    }
    public String toString() {
        String res = "";
        for (String x : words) {
            res += x + " ";
        }
        return res;
    }
}

public class J07014 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
