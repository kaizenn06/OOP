package J04021;

import java.util.Set;
import java.util.TreeSet;

public class IntSet {
    private int arr[];
    public IntSet(int arr[]) {
        this.arr = arr;
    }
    public IntSet union(IntSet a) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int x : this.arr) set.add(x);
        for (int x : a.arr) set.add(x);
        return new IntSet(set.stream().mapToInt(Integer::intValue).toArray());
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int x : arr) {
            res.append(x).append(" ");
        }
        return res.toString().trim();
    }
}