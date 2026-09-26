package J05035;

public class SinhVien implements Comparable<SinhVien> {
    private int stt;
    private String id, name, grade, email, enterprise;
    public SinhVien(int stt, String id, String name, String grade, String email, String enterprise) {
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.email = email;
        this.enterprise = enterprise;
    }
    public String getEnterprise() { return enterprise; }
    @Override
    public int compareTo(SinhVien that) {
        return this.id.compareTo(that.id);
    }
    @Override
    public String toString() {
        return String.format("%d %s %s %s %s %s", stt, id, name, grade, email, enterprise);
    }
}
