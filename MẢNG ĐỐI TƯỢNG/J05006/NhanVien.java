package J05006;

public class NhanVien {
    private int id;
    private String name, gender, date, address, tax, day;
    public NhanVien(int id, String name, String gender, String date, String address, String tax, String day) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
        this.tax = tax;
        this.day = day;
    }
    public String toString() {
        return String.format("%05d", id) + " " + name + " " + gender + " " + date + " " + address + " " + tax + " " + day;
    }
}
