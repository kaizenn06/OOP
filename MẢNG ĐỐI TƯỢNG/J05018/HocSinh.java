package J05018;

public class HocSinh implements Comparable<HocSinh> {
    private String id, name;
    private double avg;
    private String status;
    public HocSinh(int id, String name, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.id = "HS" + String.format("%02d", id);
        this.name = name;
        this.avg = (d1 * 2 + d2 * 2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10) / 12;
        this.avg = Math.round(this.avg * 100.0) / 100.0;
        this.avg = Math.round(this.avg * 10.0) / 10.0;
        if (avg >= 9) this.status = "XUAT SAC";
        else if (avg >= 8 && avg < 9) this.status = "GIOI";
        else if (avg >= 7 && avg < 8) this.status = "KHA";
        else if (avg >= 5 && avg < 7) this.status = "TB";
        else this.status = "YEU";
    }
    public int compareTo(HocSinh that) {
        if (Double.compare(that.avg, this.avg) != 0) {
            return Double.compare(that.avg, this.avg);
        }
        return this.id.compareTo(that.id);
    }
    public String toString() {
        return id + " " + name + " " + avg + " " + status;
    }
}
