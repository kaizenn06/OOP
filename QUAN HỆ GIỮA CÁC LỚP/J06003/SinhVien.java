package J06003;

public class SinhVien {
    private String id, name, phone;
    private int nhom;
    public SinhVien(String id, String name, String phone, int nhom) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.nhom = nhom;
    }
    public int getNhom() {
        return nhom;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + phone;
    }
}
