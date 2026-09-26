package J05020;

public class SinhVien implements Comparable<SinhVien> {
    private String id, name, lop, email;
    public SinhVien(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    public int compareTo(SinhVien that) {
        if (this.lop.compareTo(that.lop) != 0) {
            return this.lop.compareTo(that.lop);
        }
        return this.id.compareTo(that.id);
    }
    public String toString() {
        return String.format("%s %s %s %s", id, name, lop, email);
    }
}
