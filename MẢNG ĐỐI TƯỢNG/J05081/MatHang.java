package J05081;

public class MatHang implements Comparable<MatHang> {
    private String id, name, type;
    private long buy, sell, profit;
    public MatHang(int id, String name, String type, long buy, long sell) {
        this.id = "MH" + String.format("%03d", id);
        this.name = name;
        this.type = type;
        this.buy = buy;
        this.sell = sell;
        this.profit = sell - buy;
    }
    @Override
    public int compareTo(MatHang that) {
        if (this.profit != that.profit) {
            return Long.compare(that.profit, this.profit);
        }
        return this.id.compareTo(that.id);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", id, name, type, buy, sell, profit);
    }
}
