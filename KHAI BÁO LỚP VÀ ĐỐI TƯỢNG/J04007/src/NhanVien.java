package J04007;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class NhanVien {
    private String ma = "00001";
    private String name;
    private String gender;
    private String address;
    private String phone;
    private Date date;
    private Date day;

    public NhanVien(String name, String gender, String date, String address, String phone, String day) throws ParseException {
        this.name = name;
        this.gender = gender;
        this.date = (new SimpleDateFormat("dd/MM/yyyy")).parse(date);
        this.address = address;
        this.phone = phone;
        this.day = (new SimpleDateFormat("dd/MM/yyyy")).parse(day);
    }

    public String toString() {
        return this.ma + " " + this.name + " " + this.gender + " " + (new SimpleDateFormat("dd/MM/yyyy")).format(this.date) + " " + this.address + " " + this.phone + " " + (new SimpleDateFormat("dd/MM/yyyy")).format(this.day);
    }
}
