package J05065;

public class NhanVien implements Comparable<NhanVien> {
    private String id, name;
    private String cv, hs, nhom;
    public NhanVien(String id, String name) {
        this.id = id;
        this.name = name;
        this.cv = id.substring(0, 2);
        this.hs = id.substring(2, 4);
        this.nhom = id.substring(4);
    }
    public String getCv() {
        return cv;
    }
    public void setCv(String cv) {
        this.cv = cv;
    }
    @Override
    public int compareTo(NhanVien that) {
        if (!this.hs.equals(that.hs)) {
            return that.hs.compareTo(this.hs);
        }
        return this.nhom.compareTo(that.nhom);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s", name, cv, nhom, hs);
    }
}
