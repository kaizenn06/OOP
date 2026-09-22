package J06007;

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
    public void addTotal_time(double total_time) {
        this.total_time += total_time;
    }
    @Override
    public String toString() {
        return String.format("%s %.2f", name, total_time);
    }
}
