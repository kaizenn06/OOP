package J04006;

import java.util.*;
import java.text.*;

public class SinhVien {
    private String name, lop;
    private Date date;
    private float gpa;
    public SinhVien (String name, String lop, String date, float gpa) throws ParseException {
        this.name = name;
        this.lop = lop;
        this.date = (new SimpleDateFormat("dd/MM/yyyy")).parse(date);
        this.gpa = gpa;
    }
    public String toString() {
        return "B20DCCN001" + " " + this.name + " " + this.lop + " " + (new SimpleDateFormat("dd/MM/yyyy").format(this.date)) + " " + String.format("%.2f", this.gpa);
    }
}
