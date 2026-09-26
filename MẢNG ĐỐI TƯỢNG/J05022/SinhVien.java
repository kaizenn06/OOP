package J05022;

public class SinhVien {
    private String id, name, lop, email;
    public SinhVien(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    public String getLop() { return lop; }
    @Override
    public String toString() {
        return String.format("%s %s %s %s", id, name, lop, email);
    }
}
