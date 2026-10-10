package J07018;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class SinhVien {
    private String id, name, lop;
    private Date date;
    private double gpa;
    public SinhVien(int id, String name, String lop, String date, double gpa) throws ParseException {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = chuanhoa(name);
        this.lop = lop;
        this.gpa = gpa;
        this.date = (new SimpleDateFormat("dd/MM/yyyy")).parse(date);
    }
    public String chuanhoa(String s) {
        StringBuilder name = new StringBuilder();
        String[] arr = s.trim().toLowerCase().split("\\s+");
        for (String x : arr) {
            name.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }
        return name.toString();
    }
    public String toString() {
        return id + " " + name + lop + " " + (new SimpleDateFormat("dd/MM/yyyy")).format(date) + " " + String.format("%.2f", gpa);
    }
}
