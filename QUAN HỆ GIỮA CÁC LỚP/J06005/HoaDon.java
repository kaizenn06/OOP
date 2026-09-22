package J06005;

public class HoaDon {
    private String id, id_kh, id_mh, id_hd;
    private int quantity;
    private long money;
    private KhachHang kh;
    private MatHang mh;
    public HoaDon(int id, String id_kh, String id_mh, int quantity, KhachHang kh, MatHang mh) {
        this.id = "HD" + String.format("%03d", id);
        this.id_kh = id_kh;
        this.id_mh = id_mh;
        this.quantity = quantity;
        this.kh = kh;
        this.mh = mh;
        this.money = this.quantity * mh.getSell();
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %d %d %d %d", id, kh.getName(), kh.getAddress(), mh.getName(), mh.getType(), mh.getBuy(), mh.getSell(), quantity, money);
    }
}
