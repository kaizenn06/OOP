package J05057;

public class ThiSinh {
    private String id, name, status;
    private double ut, total;
    public ThiSinh(String id, String name, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.ut = UT();
        this.total = d1 * 2 + d2 + d3 + ut;
        this.status = STT();
    }
    public double UT() {
        String key = id.substring(0, 3);
        if (key.equals("KV1")) return 0.5;
        else if (key.equals("KV2")) return 1.0;
        else return 2.5;
    }
    public String STT() {
        if (total >= 24) return "TRUNG TUYEN";
        else return "TRUOT";
    }
    public String formatDouble(double d) {
        if (d == (long)d) return String.format("%d", (long)d);
        else return String.format("%.1f", d);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", id, name, formatDouble(ut), formatDouble(total - ut), status);
    }
}
