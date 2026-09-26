package J05052;

public class DonHang {
    private String name, id, stt;
    private long voucher, money;
    public DonHang(String name, String id, long price, long quantity) {
        this.name = name;
        this.id = id;
        this.stt = id.substring(1, 4);
        this.voucher = Math.round(sell() * price * quantity);
        this.money = price * quantity - this.voucher;
    }
    public double sell() {
        Character key = id.charAt(id.length() - 1);
        if (key.equals('1')) return 50.0 / 100.0;
        else return 30.0 / 100.0;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", name, id, stt, voucher, money);
    }
}
