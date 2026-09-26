package J05016;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class KhachHang implements Comparable<KhachHang> {
    private String id, name;
    private int numberOfRoom;
    private long days, toll, total;
    public KhachHang(int id, String name, int numberOfRoom, String checkin, String checkout, long toll) {
        this.id = "KH" + String.format("%02d", id);
        this.name = name;
        this.numberOfRoom = numberOfRoom;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate in = LocalDate.parse(checkin.trim(), formatter);
        LocalDate out = LocalDate.parse(checkout.trim(), formatter);
        this.days = ChronoUnit.DAYS.between(in, out) + 1;
        this.toll = toll;
        this.total = this.days * getPrice(numberOfRoom) + this.toll;
    }
    private long getPrice(int room) {
        int floor = room / 100;
        switch(floor) {
            case 1 : return 25;
            case 2 : return 34;
            case 3 : return 50;
            case 4 : return 80;
            default : return 0;
        }
    }
    public int compareTo(KhachHang that) {
        return Long.compare(that.total, this.total);
    }
    public String toString() {
        return id + " " + name + " " + numberOfRoom + " " + days + " " + total;
    }
}
