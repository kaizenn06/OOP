package J06008;

public class GiangVien {
    private String id, name;
    private double total_time;
    public GiangVien(String id, String name) {
        this.id = id;
        this.name = name.trim();
        this.total_time = 0;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getTotal_time() {
        return total_time;
    }
    public void addTotal_time(double total_time) {
        this.total_time += total_time;
    }
}