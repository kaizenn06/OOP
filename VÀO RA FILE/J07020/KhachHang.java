package J07020;

public class KhachHang {
    private String id, name, gender, birthday, address;

    public KhachHang(int id, String name, String gender, String birthday, String address) {
        this.id = String.format("KH%03d", id);
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }
}
