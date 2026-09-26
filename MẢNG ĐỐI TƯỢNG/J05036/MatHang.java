package J05036;

public class MatHang {
    private String id, name, unit;
    private double fee, money, sell;
    public MatHang(int id, String name, String unit, long quantity, long price) {
        this.id = "MH" + String.format("%02d", id);
        this.name = name;
        this.unit = unit;
        this.fee = (quantity * price) * 0.05;
        this.money = (quantity * price) + fee;
        this.sell = this.money + this.money * 0.02;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", id, name, unit, Math.round(fee), Math.round(money), Math.round(sell));
    }
}
