package J05033;

public class Time implements Comparable<Time> {
    private int hours, minutes, seconds;
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    @Override
    public int compareTo(Time that) {
        if (this.hours != that.hours) {
            return Integer.compare(this.hours, that.hours);
        }
        else if (this.minutes != that.minutes) {
            return Integer.compare(this.minutes, that.minutes);
        }
        return Integer.compare(this.seconds, that.seconds);
    }
    @Override
    public String toString() {
        return String.format("%d %d %d", hours, minutes, seconds);
    }
}
