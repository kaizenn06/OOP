package J05012;

public class HoaDon implements Comparable<HoaDon>{
    private String id, name;
    private long sl, price, ck, total;
    public HoaDon(String id, String name, long sl, long price, long ck) {
        this.id = id;
        this.name = name;
        this.sl = sl;
        this.price = price;
        this.ck = ck;
        this.total = sl * price - ck;
    }
    public int compareTo(HoaDon that) {
        return Long.compare(that.total, this.total);
    }
    public String toString() {
        return id + " " + name + " " + sl + " " + price + " " + ck + " " + total;
    }
}
