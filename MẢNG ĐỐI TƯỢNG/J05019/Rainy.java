package J05019;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Rainy {
    private String id, name;
    private long minutes;
    private double total;
    public Rainy(int id, String name) {
        this.id = "T" + String.format("%02d", id);
        this.name = name;
        this.minutes = 0;
        this.total = 0;
    }
    public String getName() { return name; }
    public void add(String start, String end, double total) {
        LocalTime s = LocalTime.parse(start);
        LocalTime e = LocalTime.parse(end);
        long minutes = ChronoUnit.MINUTES.between(s, e);
        this.minutes += minutes;
        this.total += total;
    }
    public double getAvg() {
        return total / minutes * 60.0;
    }
    public String toString() {
        return String.format("%s %s %.2f", id, name, getAvg());
    }
}
