package J05037;

public class MatHang implements Comparable<MatHang> {
    private String id, name, unit;
    private double fee, money, sell;
    public MatHang(int id, String name, String unit, long quantity, long price) {
        this.id = "MH" + String.format("%02d", id);
        this.name = name;
        this.unit = unit;
        this.fee = (quantity * price) * 0.05;
        this.money = (quantity * price) + fee;
        this.sell = (this.money + this.money * 0.02) / price;
    }
    @Override
    public int compareTo(MatHang that) {
        return Double.compare(that.sell, this.sell);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %.0f", id, name, unit, Math.round(fee), Math.round(money), Math.ceil(sell / 100.0) * 100);
    }
}
