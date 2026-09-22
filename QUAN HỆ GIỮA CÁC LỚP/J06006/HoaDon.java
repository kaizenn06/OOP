package J06006;

public class HoaDon implements Comparable<HoaDon> {
    private String id, id_kh, id_mh, id_hd;
    private int quantity;
    private long total_buy, total_sell, money;
    private KhachHang kh;
    private MatHang mh;
    public HoaDon(int id, String id_kh, String id_mh, int quantity, KhachHang kh, MatHang mh) {
        this.id = "HD" + String.format("%03d", id);
        this.id_kh = id_kh;
        this.id_mh = id_mh;
        this.quantity = quantity;
        this.kh = kh;
        this.mh = mh;
        this.total_buy = this.quantity * mh.getBuy();
        this.total_sell = this.quantity * mh.getSell();
        this.money = this.total_sell - this.total_buy;
    }
    @Override
    public int compareTo(HoaDon that) {
        return Long.compare(that.money, this.money);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %d %d %d", id, kh.getName(), kh.getAddress(), mh.getName(), quantity, total_sell, money);
    }
}