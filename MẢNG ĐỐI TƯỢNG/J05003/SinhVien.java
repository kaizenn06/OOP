package J05003;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    private String id, name, lop;
    private Date date;
    private double gpa;
    public SinhVien(int id, String name, String lop,  String date, double gpa) throws ParseException {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.lop = lop;
        this.gpa = gpa;
        this.date = (new SimpleDateFormat("dd/MM/yyyy")).parse(date);
    }
    public String toString() {
        return id + " " + name + " " + lop + " " + (new SimpleDateFormat("dd/MM/yyyy")).format(date) + " " + String.format("%.2f",gpa);
    }
}
