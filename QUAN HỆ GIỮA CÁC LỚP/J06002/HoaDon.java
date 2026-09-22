package J06002;

public class HoaDon implements Comparable<HoaDon> {
    private String id;
    private int quantity;
    private long pay;
    private long discount;
    private long final_pay;
    private SanPham a;
    public HoaDon(int stt, String id, int quantity, SanPham a) {
        this.id = id + String.format("-%03d", stt);
        this.quantity = quantity;
        this.a = a;
        this.pay = quantity * a.getPrice(id.charAt(2));
        this.discount = dis();
        this.final_pay = this.pay - discount;
    }
    public long dis() {
        if (quantity >= 150) return pay * 50 / 100;
        else if (quantity >= 100) return pay * 30 / 100;
        else if (quantity >= 50) return pay * 15 / 100;
        else return 0;
    }
    @Override
    public int compareTo(HoaDon that) {
        return Long.compare(that.final_pay, this.final_pay);
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %d", id, a.getName(), discount, final_pay);
    }
}
