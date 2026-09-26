package J05028;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String id, name;
    private int quantity;
    public DoanhNghiep(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    @Override
    public int compareTo(DoanhNghiep that) {
        if (Integer.compare(that.quantity, this.quantity) != 0) {
            return Integer.compare(that.quantity, this.quantity);
        }
        return this.id.compareTo(that.id);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + quantity;
    }
}
