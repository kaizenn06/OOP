package J05007;

public class NhanVien implements Comparable<NhanVien> {
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
    public int compareTo(NhanVien that) {
        String[] d1 = this.date.split("/");
        String[] d2 = that.date.split("/");
        String date1 = d1[2] + d1[1] + d1[0];
        String date2 = d2[2] + d2[1] + d2[0];
        return date1.compareTo(date2);
    }
    public String toString() {
        return String.format("%05d", id) + " " + name + " " + gender + " " + date + " " + address + " " + tax + " " + day;
    }
}
