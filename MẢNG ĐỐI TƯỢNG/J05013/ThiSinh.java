package J05013;

public class ThiSinh implements Comparable<ThiSinh>{
    private String id, name;
    private double lt, th, avg;
    private String kq;
    public ThiSinh(int id, String name, double lt, double th) {
        this.id = "TS" + String.format("%02d", id);
        this.name = name;
        if (lt > 10) this.lt = lt / 10;
        else this.lt = lt;
        if (th > 10) this.th = th / 10;
        else this.th = th;
        this.avg = (this.lt + this.th) / 2;
        if (this.avg < 5) this.kq = "TRUOT";
        else if (this.avg >= 5 && this.avg < 8) this.kq = "CAN NHAC";
        else if (this.avg >= 8 && this.avg < 9.5) this.kq = "DAT";
        else this.kq = "XUAT SAC";
    }
    public int compareTo(ThiSinh that) {
        return Double.compare(that.avg, this.avg);
    }
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", avg) + " " + kq;
    }
}
