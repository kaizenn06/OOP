import java.util.*;
import java.io.*;
import java.text.*;

class SinhVien {
    private String id, name, lop;
    private Date date;
    private double gpa;
    public SinhVien(int id, String name, String lop, String date, double gpa) throws ParseException{
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.lop = lop;
        this.gpa = gpa;
        this.date = (new SimpleDateFormat("dd/MM/yyyy")).parse(date);
    }
    public String toString() {
        return id + " " + name + " " + lop + " " + (new SimpleDateFormat("dd/MM/yyyy")).format(date) + " " + String.format("%.2f", gpa);
    }
}


public class J07010 {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0 ; i < n ; i++) {
            sc.nextLine();
            sv[i] = new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            System.out.println(sv[i]);
        }
    }
}