package J06009;

public class KhachHang {
    private String id, name, gender, date, address;
    public KhachHang(int id, String name, String gender, String date, String address) {
        this.id = "KH" + String.format("%03d", id);
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}
