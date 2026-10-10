package J07058;

public class MonHoc implements Comparable<MonHoc> {
    private String id, name, ht;
    public MonHoc(String id, String name, String ht) {
        this.id = id;
        this.name = name;
        this.ht = ht;
    }
    public int compareTo(MonHoc that) {
        return this.id.compareTo(that.id);
    }
    public String toString() {
        return id + " " + name + " " + ht;
    }
}
