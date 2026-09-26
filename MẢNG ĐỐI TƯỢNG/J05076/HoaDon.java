package J05076;

public class HoaDon {
    private String id;
    private long quantity_buy, price_buy, quantity_sell, total_buy, total_sell;
    private double laixuat;
    private MatHang mh;
    public HoaDon(String id, long quantity_buy, long price_buy, long quantity_sell, MatHang mh) {
        this.id = id;
        this.quantity_buy = quantity_buy;
        this.price_buy = price_buy;
        this.quantity_sell = quantity_sell;
        this.mh = mh;
        this.total_buy = this.quantity_buy * this.price_buy;
        this.total_sell = this.quantity_sell * price_buy;
        this.laixuat = LAI();
        this.total_sell = Math.round(this.total_sell + this.laixuat);
    }
    private double LAI() {
        String key = mh.getRank();
        if (key.equals("A")) return total_sell * 0.08;
        else if (key.equals("B")) return total_sell * 0.05;
        else return total_sell * 0.02;
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %d", id, mh.getName(), total_buy, total_sell);
    }
}
