package J05014;

public class GiaoVien implements Comparable<GiaoVien> {
    private String id, name, mon;
    private double total, uutien;
    private String status;
    public GiaoVien(int id, String name, String ma, double d1, double d2) {
        this.id = "GV" + String.format("%02d", id);
        this.name = name;
        if (ma.charAt(0) == 'A') this.mon = "TOAN";
        else if (ma.charAt(0) == 'B') this.mon = "LY";
        else this.mon = "HOA";
        if (ma.charAt(1) == '1') this.uutien = 2;
        else if (ma.charAt(1) == '2') this.uutien = 1.5;
        else if (ma.charAt(1) == '3') this.uutien = 1;
        else this.uutien = 0;
        this.total = d1 * 2 + d2 + this.uutien;
        if (this.total >= 18) this.status = "TRUNG TUYEN";
        else this.status = "LOAI";
    }
    public int compareTo(GiaoVien that) {
        return Double.compare(that.total, this.total);
    }
    public String toString() {
        return  id + " " + name + " " + mon + " " + String.format("%.1f", total) + " " + status;
    }
}
