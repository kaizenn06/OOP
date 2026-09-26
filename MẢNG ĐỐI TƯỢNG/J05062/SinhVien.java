package J05062;

public class SinhVien implements Comparable<SinhVien> {
    private String name, status;
    private double gpa;
    private int drl;
    public SinhVien(String name, double gpa, int drl) {
        this.name = name;
        this.gpa = gpa;
        this.drl = drl;
        this.status = xuly();
    }
    public String xuly() {
        if (gpa >= 3.6 && drl >= 90) return "XUATSAC";
        if (gpa >= 3.2 && drl >= 80) return "GIOI";
        if (gpa >= 2.5 && drl >= 70) return "KHA";
        return "KHONG";
    }
    public double getGpa() { return gpa; }
    public String getStatus() { return status; }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public int compareTo(SinhVien that) {
        return Double.compare(that.gpa, this.gpa);
    }
    @Override
    public String toString() {
        return String.format("%s: %s", name, status);
    }
}
