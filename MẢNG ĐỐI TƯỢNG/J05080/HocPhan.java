package J05080;

public class HocPhan implements Comparable<HocPhan> {
    private String id, name, nhom, lecturer;
    public HocPhan(String id, String name, String nhom, String lecturer) {
        this.id = id;
        this.name = name;
        this.nhom = nhom;
        this.lecturer = lecturer;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLecturer() {
        return lecturer;
    }
    @Override
    public int compareTo(HocPhan that) {
        if (!this.id.equals(that.id)) {
            return this.id.compareTo(that.id);
        }
        return this.nhom.compareTo(that.nhom);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + nhom;
    }
}
