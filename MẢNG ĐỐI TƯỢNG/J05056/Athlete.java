package J05056;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Athlete implements Comparable<Athlete> {
    private String id, name, start_time, finish_time, tt, ut, tt_s;
    private int age, rank;
    public Athlete(int id, String name, String date, String start_time, String finish_time) {
        this.id = "VDV" + String.format("%02d", id);
        this.name = name;
        this.age = 2021 - Integer.parseInt(date.substring(6));
        this.start_time = start_time;
        this.finish_time = finish_time;
        this.tt = TT();
        this.ut = UT();
        this.tt_s = subUT();
    }
    public String TT() {
        LocalTime start = LocalTime.parse(start_time);
        LocalTime finish = LocalTime.parse(finish_time);
        long seconds = ChronoUnit.SECONDS.between(start, finish);
        LocalTime time = LocalTime.ofSecondOfDay(seconds);
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
    public String UT() {
        int secondUT;
        if (age < 18) secondUT = 0;
        else if (18 <= age && age < 25) secondUT = 1;
        else if (25 <= age && age < 32) secondUT = 2;
        else secondUT = 3;
        LocalTime time = LocalTime.ofSecondOfDay(secondUT);
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
    public String subUT() {
        LocalTime t1 = LocalTime.parse(ut);
        LocalTime t2 = LocalTime.parse(tt);
        long seconds = ChronoUnit.SECONDS.between(t1, t2);
        LocalTime time = LocalTime.ofSecondOfDay(seconds);
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
    public String getTt_s() { return tt_s; }
    public int getRank() { return rank; }
    public void SetRank(int rank) { this.rank = rank; }
    @Override
    public int compareTo(Athlete that) {
        return this.tt_s.compareTo(that.tt_s);
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %d", id, name, tt, ut, tt_s, rank);
    }
}
