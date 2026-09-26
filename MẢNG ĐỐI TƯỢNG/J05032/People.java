package J05032;

public class People implements Comparable<People> {
    private String name;
    private int day, month, year;
    public People(String name, String date) {
        this.name = name;
        this.day = Integer.parseInt(date.substring(0, 2));
        this.month = Integer.parseInt(date.substring(3, 5));
        this.year = Integer.parseInt(date.substring(6));
    }
    @Override
    public int compareTo(People that) {
        if (this.year != that.year) {
            return Integer.compare(this.year, that.year);
        }
        else if (this.month != that.month) {
            return Integer.compare(this.month, that.month);
        }
        return Integer.compare(this.day, that.day);
    }
    @Override
    public String toString() {
        return name;
    }
}
