package J07013;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

class SinhVien implements Serializable{
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int ma, String ten, String lop, String ngaysinh, float gpa) throws Exception {
        this.ma = String.format("B20DCCN%03d", ma);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = (new SimpleDateFormat("dd/MM/yyyy")).parse(ngaysinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", ma, ten, lop, (new SimpleDateFormat("dd/MM/yyyy")).format(ngaysinh), gpa);
    }
}
public class J07013 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> a = (ArrayList<SinhVien>) ois.readObject();
        ois.close();
        for (SinhVien sv : a) {
            System.out.println(sv);
        }
    }
}
