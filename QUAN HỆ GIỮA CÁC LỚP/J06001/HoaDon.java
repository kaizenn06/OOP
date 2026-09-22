package J06001;

public class HoaDon {
    private String id;
    private int sl;
    private SanPham a;
    private long discount;
    private long final_price;
    public HoaDon(int stt, String id, int sl, SanPham a) {
        this.id = id + String.format("-%03d", stt);
        this.sl = sl;
        this.a = a;
        solve();
    }
    public void solve() {
        long price = a.getPrice(id.charAt(2));
        long money = price * sl;
        if (sl >= 150) discount = money * 50 / 100;
        else if (sl >= 100) discount = money * 30 / 100;
        else if (sl >= 50) discount = money * 15 / 100;
        else discount = 0;
        final_price = money - discount;
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %d", id, a.getName(), discount, final_price);
    }
}
