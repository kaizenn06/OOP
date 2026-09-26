package J05068;

public class DonHang implements Comparable<DonHang> {
    private String id, key, name;
    private Character type;
    private long quantity, price, tax, total;
    public DonHang(String id, long quantity) {
        this.id = id;
        this.type = id.charAt(0);
        this.key = id.substring(3);
        this.name = TEN();
        this.quantity = quantity;
        this.price = GIA();
        this.tax = THUE();
        this.total = this.quantity * this.price + this.tax;
    }
    public String TEN() {
        switch(key) {
            case "BP" : return "British Petro";
            case "ES" : return "Esso";
            case "SH" : return "Shell";
            case "CA" : return "Castrol";
            case "MO" : return "Mobil";
            default: return "Trong Nuoc";
        }
    }
    private int GIA() {
        switch(type) {
            case 'X' : return 128000;
            case 'D' : return 11200;
            case 'N' : return 9700;
            default: return 0;
        }
    }
    private long THUE() {
        if (this.name.equals("Trong Nuoc")) return 0;
        long money = quantity * price;
        switch(type) {
            case 'X' : return money * 3/100;
            case 'D' : return money * 35/1000;
            case 'N' : return money * 2/100;
            default: return 0;
        }
    }
    @Override
    public int compareTo(DonHang that) {
        return Long.compare(that.total, this.total);
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %d %d", id, name, price, tax, total);
    }
}
