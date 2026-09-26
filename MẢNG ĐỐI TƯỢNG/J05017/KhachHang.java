package J05017;

public class KhachHang implements Comparable<KhachHang> {
    private String id, name;
    private long total;
    public KhachHang(int id, String name, int oldVal, int newVal) {
        this.id = "KH" + String.format("%02d", id);
        this.name = name;
        int val = newVal - oldVal;
        double Cost = 0;
        double Fee = 0;
        if (val <= 50) {
            Cost = val * 100;
            Fee = 0.02;
        }
        else if (val >= 51 && val <= 100) {
            Cost = 50 * 100 + (val - 50) * 150;
            Fee = 0.03;
        }
        else {
            Cost = 50 * 100 + 50 * 150 + (val - 100) * 200;
            Fee = 0.05;
        }
        this.total = Math.round(Cost * (1 + Fee));
    }
    public int compareTo(KhachHang that) {
        return Long.compare(that.total, this.total);
    }
    public String toString() {
        return id + " " + name + " " + total;
    }
}
