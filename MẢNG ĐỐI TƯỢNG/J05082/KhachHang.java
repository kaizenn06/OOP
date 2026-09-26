package J05082;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class KhachHang implements Comparable<KhachHang> {
    private String id, name, gender, address;
    private Date date;
    public KhachHang(int id, String name, String gender, String birthday, String address) throws ParseException {
        this.id = "KH" + String.format("%03d", id);
        this.name = CH(name.trim().toLowerCase());
        this.gender = gender;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        this.address = address;
    }
    private String CH(String key) {
        StringBuilder s = new StringBuilder();
        String[] name = key.split("\\s+");
        for (String x : name) {
            s.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }
        return s.toString();
    }
    @Override
    public int compareTo(KhachHang that) {
        return this.date.compareTo(that.date);
    }
    @Override
    public String toString() {
        return id + " " + name + gender + " " + address + " " + new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}
