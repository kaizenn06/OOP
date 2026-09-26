package J05042;

public class SinhVien implements Comparable<SinhVien> {
    private String name;
    private int ac, submits;
    public SinhVien(String name, int ac, int submits) {
        this.name = name;
        this.ac = ac;
        this.submits = submits;
    }
    @Override
    public int compareTo(SinhVien that) {
        if (this.ac != that.ac) {
            return Integer.compare(that.ac, this.ac);
        }
        return Integer.compare(this.submits, that.submits);
    }
    @Override
    public String toString() {
        return name + " " + ac + " " + submits;
    }
}
