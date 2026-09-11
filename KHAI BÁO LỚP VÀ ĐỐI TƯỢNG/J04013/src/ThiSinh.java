package J04013;

public class ThiSinh {
    private String id;
    private String name;
    private double toan, ly, hoa, total, diemcong;
    private String status;
    public ThiSinh(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        String kv = this.id.substring(0,3);
        if (kv.equals("KV1")) this.diemcong = 0.5;
        else if (kv.equals("KV2")) this.diemcong = 1.0;
        else if (kv.equals("KV3")) this.diemcong = 2.0;
        this.total = this.toan * 2 + this.ly + this.hoa + this.diemcong;
        if (this.total >= 24) this.status = "TRUNG TUYEN";
        else this.status = "TRUOT";
    }
    public String toString() {
        String res = String.format("%s %s ", this.id, this.name);
        if (this.diemcong == (int)this.diemcong) {
            res += String.format("%.0f ", this.diemcong);
        }
        else res += String.format("%.1f ", this.diemcong);
        if (this.total == (int)this.total) {
            res += String.format("%.0f ", this.total - this.diemcong);
        }
        else res += String.format("%.1f ", this.total - this.diemcong);
        res += String.format("%s\n", this.status);
        return res;
    }
}
