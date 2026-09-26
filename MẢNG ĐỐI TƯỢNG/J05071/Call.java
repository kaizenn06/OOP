package J05071;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Call {
    private String id, start_time, end_time;
    private Country ct;
    private long total_minutes, money;
    public Call(String id, String start_time, String end_time, Country ct) {
        this.id = id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.ct = ct;
        this.total_minutes = solve();
        this.money = this.total_minutes * this.ct.getPrice();
    }
    private long solve() {
        LocalTime start = LocalTime.parse(start_time);
        LocalTime end = LocalTime.parse(end_time);
        if (ct.getName().equals("Noi mang")) {
            return Math.round(ChronoUnit.MINUTES.between(start, end) / 3.0);
        }
        return ChronoUnit.MINUTES.between(start, end);
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %d", id, ct.getName(), total_minutes, money);
    }
}
