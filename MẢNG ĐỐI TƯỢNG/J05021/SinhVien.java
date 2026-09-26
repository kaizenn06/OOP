package J05021;

public class SinhVien implements Comparable<SinhVien> {
    private String id, name, lop, email;
    public SinhVien(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    @Override
    public int compareTo(SinhVien that) {
        return this.id.compareTo(that.id);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s", id, name, lop, email);
    }
}
