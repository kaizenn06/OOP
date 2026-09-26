package J05031;

public class SinhVien implements Comparable<SinhVien> {
    private String id, name, grade;
    private double d1, d2, d3;
    public SinhVien(String id, String name, String grade, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    @Override
    public int compareTo(SinhVien that) {
        return this.name.compareTo(that.name);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %.1f %.1f %.1f", id, name, grade, d1, d2 ,d3);
    }
}
