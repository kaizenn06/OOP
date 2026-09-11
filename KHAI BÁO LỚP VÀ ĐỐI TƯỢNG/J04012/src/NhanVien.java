package J04012;

public class NhanVien {
    private String id = "NV01";
    private String name;
    private long salary;
    private long days;
    private String regency;
    public NhanVien(String name, long salary, long days, String regency) {
        this.name = name;
        this.salary = salary;
        this.days = days;
        this.regency = regency;
    }
    public String toString() {
        long luong = this.salary * this.days;
        long thuong = 0, phucap = 0;
        if (this.days >= 25) {
            thuong = (long)(luong * 0.2);
        }
        else if (22 <= this.days && this.days < 25) {
            thuong = (long)(luong * 0.1);
        }
        if (this.regency.equals("GD")) phucap = 250000;
        else if (this.regency.equals("PGD")) phucap = 200000;
        else if (this.regency.equals("TP")) phucap = 180000;
        else if (this.regency.equals("NV")) phucap = 150000;
        long tongtien = luong + thuong + phucap;
        return this.id + " " + this.name + " " + luong + " " + thuong + " " + phucap + " " + tongtien;
    }
}
