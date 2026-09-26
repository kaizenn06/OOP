package J05048;

public class MaHang {
    private String id;
    private long quantity_in, quantity_out, price, money, tax;
    public MaHang(String id, long quantity) {
        this.id = id;
        this.quantity_in = quantity;
        this.quantity_out = out();
        this.price = dongia();
        this.money = this.quantity_out * this.price;
        this.tax = thue();
    }
    public long out() {
        Character key = id.charAt(0);
        if (key.equals('A')) return Math.round(quantity_in * 0.6);
        else return Math.round(quantity_in * 0.7);
    }
    public long dongia() {
        Character key = id.charAt(id.length() - 1);
        if (key.equals('Y')) return 110000;
        else return 135000;
    }
    public long thue() {
        Character key1 = id.charAt(0);
        Character key2 = id.charAt(id.length() - 1);
        double taxRate = 0;
        if (key1.equals('A') && key2.equals('Y')) taxRate = 0.08;
        else if (key1.equals('A') && key2.equals('N')) taxRate = 0.11;
        else if (key1.equals('B') && key2.equals('Y')) taxRate = 0.17;
        else taxRate = 0.22;
        return Math.round(money * taxRate);
    }
    @Override
    public String toString() {
        return String.format("%s %d %d %d %d %d", id, quantity_in, quantity_out, price, money, tax);
    }
}