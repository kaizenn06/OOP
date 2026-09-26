package J05015;

public class CuaRow implements Comparable<CuaRow> {
    private String id, name, dv, time;
    private long speed;
    public CuaRow(String name, String dv, String time) {
        this.id = "";
        this.name = name;
        this.dv = dv;
        this.time = time;
        String[] s1 = name.trim().split("\\s+");
        String[] s2 = dv.trim().split("\\s+");
        String[] s3 = time.trim().split(":");
        for (String x : s2) this.id += Character.toUpperCase(x.charAt(0));
        for (String x : s1) this.id += Character.toUpperCase(x.charAt(0));
        double total_hours = Integer.parseInt(s3[0]) - 6 + Integer.parseInt(s3[1]) / 60.0;
        this.speed = Math.round(120.0 / total_hours);
    }
    public int compareTo(CuaRow that) {
        return this.time.compareTo(that.time);
    }
    public String toString() {
        return id + " " + name + " " + dv + " " + speed + " Km/h";
    }
}
