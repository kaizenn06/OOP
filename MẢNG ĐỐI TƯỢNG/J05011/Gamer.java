package J05011;

public class Gamer implements Comparable<Gamer>{
    private String id, name;
    private int hours, minutes, total;
    public Gamer(String id, String name, String time_in, String time_out) {
        this.id = id;
        this.name = name;
        String[] in = time_in.trim().split(":");
        String[] out = time_out.trim().split(":");
        this.minutes = Integer.parseInt(out[1]) - Integer.parseInt(in[1]);
        this.hours = Integer.parseInt(out[0]) - Integer.parseInt(in[0]);
        if (this.minutes < 0) {
            this.hours -= 1;
            this.minutes += 60;
        }
        this.total = this.hours * 60 + this.minutes;
    }
    public int compareTo(Gamer that) {
        return Integer.compare(that.total, this.total);
    }
    public String toString() {
        return id + " " + name + " " + hours + " gio " + minutes + " phut";
    }
}
