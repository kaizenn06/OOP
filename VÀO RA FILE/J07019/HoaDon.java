package J07019;

public class HoaDon {
    private String id;
    private long quantity;
    private SanPham sp;
    private long type, pay, voucher, final_pay;

    public HoaDon(int stt, String id, long quantity, SanPham sp) {
        this.id = id + String.format("-%03d", stt);
        this.quantity = quantity;
        this.sp = sp;
        this.type = Long.parseLong(id.substring(2));
        this.pay = quantity * sp.getPrice(this.type);
        this.voucher = GIAM();
        this.final_pay = this.pay - this.voucher;
    }
    private long GIAM() {
        if (quantity >= 150) return pay * 50 / 100;
        else if (quantity >= 100) return pay * 30 / 100;
        else if (quantity >= 50) return pay * 15 / 100;
        else return 0;
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %d", id, sp.getName(), voucher, final_pay);
    }
}
