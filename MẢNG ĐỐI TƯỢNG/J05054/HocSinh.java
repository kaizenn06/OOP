package J05054;

public class HocSinh implements Comparable<HocSinh> {
    private String id, name, xl;
    private int rank;
    private double avg;
    public HocSinh(int id, String name, double avg) {
        this.id = "HS" + String.format("%02d", id);
        this.name = name;
        this.avg = avg;
        this.xl = xeploai();
    }
    public String xeploai() {
        if (avg < 5) return "Yeu";
        else if (5 <= avg && avg < 7) return "Trung Binh";
        else if (7 <= avg && avg < 9) return "Kha";
        else return "Gioi";
    }
    public double getAvg() { return avg; }
    public int getRank() { return rank; }
    public void setRank(int r) { rank = r; }
    @Override
    public int compareTo(HocSinh that) {
        return Double.compare(that.avg, this.avg);
    }
    @Override
    public String toString() {
        return String.format("%s %s %.1f %s %d", id, name, avg, xl, rank);
    }
}
