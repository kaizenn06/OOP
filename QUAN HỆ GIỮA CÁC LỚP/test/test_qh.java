package test;

import java.util.*;
import java.io.*;

class HoaDon {
    private String id, id_kh, id_mh, id_hd;
    private int quantity;
    private long money;
    private KhachHang kh;
    private MatHang mh;
    public HoaDon(int id, String id_kh, String id_mh, int quantity, KhachHang kh, MatHang mh) {
        this.id = "HD" + String.format("%03d", id);
        this.id_kh = id_kh;
        this.id_mh = id_mh;
        this.quantity = quantity;
        this.kh = kh;
        this.mh = mh;
        this.money = this.quantity * mh.getSell();
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %d %d %d %d", id, kh.getName(), kh.getAddress(), mh.getName(), mh.getType(), mh.getBuy(), mh.getSell(), quantity, money);
    }
}

class MatHang {
    private String id, name, type;
    private long buy, sell;
    public MatHang(int id, String name, String type, long buy, long sell) {
        this.id = "MH" + String.format("%03d", id);
        this.name = name;
        this.type = type;
        this.buy = buy;
        this.sell = sell;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public long getBuy() {
        return buy;
    }
    public long getSell() {
        return sell;
    }
}

class KhachHang {
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

public class test_qh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner f1 = new Scanner(new File("KH.in"));
        Scanner f2 = new Scanner(new File("MH.in"));
        Scanner f3 = new Scanner(new File("HD.in"));
        int n = Integer.parseInt(f1.nextLine());
        KhachHang[] kh = new KhachHang[n];
        for (int i = 0 ; i < n ; i++) {
            kh[i] = new KhachHang(i + 1, f1.nextLine(), f1.nextLine(), f1.nextLine(), f1.nextLine());
        }
        int m = f2.nextInt();
        MatHang[] mh = new MatHang[m];
        for (int i = 0 ; i < m ; i++) {
            f2.nextLine();
            mh[i] = new MatHang(i + 1, f2.nextLine(), f2.nextLine(), f2.nextLong(), f2.nextLong());
        }
        int k = f3.nextInt();
        HoaDon[] hd = new HoaDon[k];
        for (int i = 0 ; i < k ; i++) {
            String id_kh = f3.next();
            String id_mh = f3.next();
            int quantity = f3.nextInt();
            KhachHang a = null;
            MatHang b = null;
            for (int j = 0 ; j < n ; j++) {
                if (kh[j].getId().equals(id_kh)) {
                    a = kh[j];
                    break;
                }
            }
            for (int j = 0 ; j < m ; j++) {
                if (mh[j].getId().equals(id_mh)) {
                    b = mh[j];
                    break;
                }
            }
            hd[i] = new HoaDon(i + 1, id_kh, id_mh, quantity, a, b);
            System.out.println(hd[i]);
        }
    }
}
