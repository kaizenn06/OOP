package J05051;

public class KhachHang implements Comparable<KhachHang> {
    private String id, type;
    private long value_old, value_new, heso, money, pt, total_pay;
    public KhachHang(int id, String type, int value_old, int value_new) {
        this.id = "KH" + String.format("%02d", id);
        this.type = type;
        this.value_old = value_old;
        this.value_new = value_new;
        this.heso = hs();
        this.money = (value_new - value_old) * this.heso * 550;
        this.pt = phutroi();
        this.total_pay = this.money + this.pt;
    }
    public long hs() {
        if (type.equals("KD")) return 3;
        else if (type.equals("NN")) return 5;
        else if (type.equals("TT")) return 4;
        else return 2;
    }
    public long phutroi() {
        long value = value_new - value_old;
        if (value < 50) return 0;
        else if (value <= 100) return Math.round(money * 35.0 / 100.0);
        else return money;
    }
    @Override
    public int compareTo(KhachHang that) {
        return Long.compare(that.total_pay, this.total_pay);
    }
    @Override
    public String toString() {
        return String.format("%s %d %d %d %d", id, heso, money, pt, total_pay);
    }
}