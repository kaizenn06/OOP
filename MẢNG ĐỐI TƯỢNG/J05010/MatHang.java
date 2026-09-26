package J05010;

public class MatHang implements Comparable<MatHang> {
    private int id;
    private String name, nhom;
    private double buy, sell, loinhuan;
    public MatHang(int id, String name, String nhom, double buy, double sell) {
        this.id = id;
        this.name = name;
        this.nhom = nhom;
        this.buy = this.buy;
        this.sell = this.sell;
        this.loinhuan = sell - buy;
    }
    public int compareTo(MatHang that) {
        return Double.compare(that.loinhuan, this.loinhuan);
    }
    public String toString() {
        return id + " " + name + " " + nhom + " " + String.format("%.2f", loinhuan);
    }
}
