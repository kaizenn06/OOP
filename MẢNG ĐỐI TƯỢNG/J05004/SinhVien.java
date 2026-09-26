package J05004;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    private String id, name, lop;
    private Date date;
    private double gpa;
    public SinhVien(int id, String name, String lop, String date, double gpa) throws ParseException{
        this.id = "B20DCCN" + String.format("%03d", id);
        this.lop = lop;
        this.gpa = gpa;
        this.name = chuanhoa(name);
        this.date = (new SimpleDateFormat("dd/MM/yyyy")).parse(date);
    }
    private String chuanhoa(String s) {
        String[] word = s.trim().toLowerCase().split("\\s+");
        StringBuilder name = new StringBuilder();
        for (String x : word) {
            name.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }
        return name.toString();
    }
    public String toString() {
        return id + " " + name + lop + " " + (new SimpleDateFormat("dd/MM/yyyy")).format(date) + " " + String.format("%.2f", gpa);
    }
}
