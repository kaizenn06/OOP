package J07009;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> set;
    public IntSet(TreeSet<Integer> set) {
        this.set = set;
    }
    public IntSet(int[] a) {
        this.set = new TreeSet<>();
        for (int i = 0 ; i < a.length ; i++) {
            set.add(a[i]);
        }
    }
    public IntSet intersection(IntSet that) {
        TreeSet<Integer> set = new TreeSet<>();
        for (Integer x : this.set) {
            if (that.set.contains(x)) {
                set.add(x);
            }
        }
        return new IntSet(set);
    }
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Integer x : set) {
            res.append(x).append(" ");
        }
        return res.toString();
    }
}
